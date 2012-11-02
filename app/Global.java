import com.avaje.ebean.Ebean;

import play.Application;
import play.GlobalSettings;
import play.libs.Yaml;

import java.util.*;
import models.*;

public class Global extends GlobalSettings {
	public void onStart(Application app) {
		InitialData.insert(app);
	}

	static class InitialData {
		public static void insert(Application app) {
			if (Ebean.find(User.class).findRowCount() == 0) {
				Map<String, List<Object>> all = (Map<String, List<Object>>) Yaml
						.load("initial-data.yml");
				// Insert users first
				Ebean.save(all.get("users"));
			}
		}
	}
}
