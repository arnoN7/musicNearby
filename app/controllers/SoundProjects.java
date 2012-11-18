package controllers;

import java.util.List;

import play.data.Form;
import play.mvc.*;
import models.*;
import views.html.*;

/**
 * Manage sound projects related operations
 */
@Security.Authenticated(Secured.class)
public class SoundProjects extends Controller {

	public static Result index() {
		List<SoundProject> projects = SoundProject
				.getSoundProjetsFromUser(request().username());
		return ok(mySoundProjects.render(projects,
				User.find.byId(request().username()), form(SoundProject.class)));
	}

	/**
	 * Add a project.
	 */
	public static Result add() {
		Form<SoundProject> soundProjectForm = form(SoundProject.class);
		SoundProject newProject = null;
		if (soundProjectForm.hasErrors()) {
			return badRequest(mySoundProjects.render(
					SoundProject.getSoundProjetsFromUser(request().username()),
					User.find.byId(request().username()),
					form(SoundProject.class)));
		} else {
			newProject = soundProjectForm.bindFromRequest().get();
			newProject.owner = User.findByEmail(request().username());
			newProject.save();
			return ok(mySoundProjects.render(
					SoundProject.getSoundProjetsFromUser(request().username()),
					User.find.byId(request().username()),
					form(SoundProject.class)));
		}
	}

	/**
	 * Delete a project.
	 */
	public static Result delete(Long project) {
		if (Secured.isOwnerOfSound(project)) {
			SoundProject.find.ref(project).delete();
			return ok(mySoundProjects.render(
					SoundProject.getSoundProjetsFromUser(request().username()),
					User.find.byId(request().username()),
					form(SoundProject.class)));
		} else {
			return forbidden();
		}
	}
}
