package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;

/**
 * Sound Project managed by Ebean
 */
@Entity
public class SoundProject extends Model {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	public Long id;

	public String name;

	public String sound;

	@ManyToOne
	public User owner;

	public SoundProject(String name, String sound, User owner) {
		this.name = name;
		this.sound = sound;
		this.owner = owner;
	}

	// -- Queries

	public static Model.Finder<Long, SoundProject> find = new Model.Finder<Long, SoundProject>(
			Long.class, SoundProject.class);

	/**
	 * GetSoundsFromAUser
	 */
	public static List<SoundProject> getSoundProjetsFromUser(String userEmail) {
		
		return find.where().eq("owner.email", userEmail).findList();
	}

	/**
	 * Create a new Project
	 */
	public static SoundProject create(String name, String sound,
			String ownerEmail) {
		User projectOwner = User.findByEmail(ownerEmail);
		SoundProject soundProject = null;
		if (projectOwner != null)
		{
			soundProject = new SoundProject(name, sound,
					projectOwner);
		soundProject.save();
		}
		return soundProject;

	}

	/**
	 * Rename a SoundProject
	 */
	public static String rename(Long projectID, String newName) {
		SoundProject soundProject = find.ref(projectID);
		soundProject.name = newName;
		soundProject.update();
		return newName;
	}

	/**
	 * Return if a user is owner of a project
	 */
	public static boolean isOwner(Long projectId, String userEmail) {
		return find.where().eq("owner.email", userEmail).eq("id", projectId)
				.findRowCount() > 0;
	}
	
	public String toString () {
		return "SoundProject(" + id + ") owned by  " + (owner.name);
	}
}
