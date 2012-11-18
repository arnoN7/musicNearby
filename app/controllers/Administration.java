package controllers;

import models.User;
import play.mvc.Controller;

import play.mvc.*;
import views.html.admin;

public class Administration extends Controller {
	public static Result index() {
		return ok (admin.render(User.findAll()));
	}
}
