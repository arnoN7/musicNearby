package controllers;

import java.io.File;
import java.util.List;

import models.ReviewOffer;

import play.mvc.Controller;
import play.mvc.Http.MultipartFormData;
import play.mvc.Http.MultipartFormData.FilePart;
import play.mvc.Result;

public class ReviewManagement extends Controller {

	public static Result upload() {
		//ReviewOffer review = ReviewOffer.find.ref(reviewId);
		MultipartFormData body = request().body().asMultipartFormData();
		//List<FilePart> resourceFiles = body.getFiles();
		FilePart picture = body.getFile("picture");
		if (picture != null) {
			String fileName = picture.getFilename();
			String contentType = picture.getContentType();
			File file = picture.getFile();
			return ok("File uploaded");
		} else {
			flash("error", "Missing file");
			return redirect(routes.Application.login());
		}
	}
}
