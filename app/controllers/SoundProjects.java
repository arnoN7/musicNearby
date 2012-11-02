package controllers;

import play.mvc.*;


/**
 * Manage sound projects related operations
 */
@Security.Authenticated(Secured.class)
public class SoundProjects extends Controller{
	


	public static Result index() {
		return ok("Hello Projects"); 
	}
}
