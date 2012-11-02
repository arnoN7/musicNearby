package controllers;

import play.*;
import play.data.*;
import play.data.validation.Constraints.Required;
import play.mvc.*;

import models.*;
import views.html.*;

public class Application extends Controller {

	// -- Authentication

	public static class Login {

		@Required
		public String email;
		@Required
		public String password;

		public String validate() {
			if (User.authenticate(email, password) == null) {
				return "Invalid user or password";
			}
			return null;
		}

	}
	static Form<Task> taskForm = form(Task.class);
	
	/**
	 * Login page.
	 */
	public static Result login() {
		return ok(login.render(form(Application.Login.class)));
	}

	/**
	 * Handle login form submission.
	 */
	public static Result authenticate() {
		Form<Login> filledLogin = form(Application.Login.class).bindFromRequest();
		if (filledLogin.hasErrors()) {
			return badRequest(login.render(filledLogin));
			//return ok("WRONG!!!!");
		} else {
			return ok("HELLO " + filledLogin.get().email);
			//session("email", loginForm.get().email);
			//return redirect(routes.SoundProjects.index());
		}
	}
	
	public static Result tasks() {
		return ok(views.html.index.render(Task.all(), taskForm));
	}

	public static Result newTask() {
		Form<Task> filledForm = taskForm.bindFromRequest();
		if (filledForm.hasErrors()) {
			return badRequest(views.html.index.render(Task.all(), filledForm));
		} else {
			Task.create(filledForm.get());
			return redirect(routes.Application.tasks());
		}
	}
	
	public static Result deleteTask(Long id) {
		Task.delete(id);
		return redirect(routes.Application.tasks());
	}


	/**
	 * Logout and clean the session.
	 */
	public static Result logout() {
		// session().clear();
		// flash("success", "You've been logged out");
		// return redirect(routes.Application.login());
		return TODO;
	}

	public static Result index() {
		return ok("Hello world");
		// return TODO;
	}
}