package controllers;

import java.io.File;
import java.util.List;

import models.JobOffer;
import models.ReviewOffer;
import models.User;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import play.mvc.Http.MultipartFormData;
import play.mvc.Http.MultipartFormData.FilePart;
import views.html.*;
import play.data.Form;


/**
 * Manage jobOffers related operations
 */
@Security.Authenticated(Secured.class)
public class JobOffers extends Controller{
	
	public static Result index() {
		List<JobOffer> jobs = JobOffer
				.getjobOffersFromUser(request().username());
		return ok(myJobOffers.render(jobs,
				User.find.byId(request().username()), form(JobOffer.class)));
	}
	
	public static Result saveOffer() {
		Form<JobOffer> jobOfferForm = form(JobOffer.class);
		JobOffer newOffer = null;
		if (jobOfferForm.hasErrors()) {
			return ok(myJobOffers.render(
					JobOffer.getjobOffersFromUser(request().username()),
					User.find.byId(request().username()),
					form(JobOffer.class))); 
		} else {
			ReviewOffer review = new ReviewOffer(newOffer);
			jobOfferForm = jobOfferForm.bindFromRequest();
			newOffer = jobOfferForm.get();
			newOffer.applicant = User.findByEmail(request().username());
			newOffer.status = models.Status.New;
			newOffer.review = review;
			review.save();
			newOffer.save();
			return badRequest(myJobOffers.render(
					JobOffer.getjobOffersFromUser(request().username()),
					User.find.byId(request().username()),
					form(JobOffer.class))); 
		}
	}
	
	public static Result addJobOffer()
	{
		User currentUser = User.find.byId(request().username());
		Form<JobOffer> form =form(JobOffer.class);
		return ok(newOffer.render(currentUser,  form));
	}
	
	/**
	 * Delete a jobOffer.
	 */
	public static Result delete(Long jobId) {
		if (Secured.isOwnerOfJobOffer(jobId)) {
			JobOffer.find.ref(jobId).delete();
			return ok(myJobOffers.render(
					JobOffer.getjobOffersFromUser(request().username()),
					User.find.byId(request().username()),
					form(JobOffer.class)));
		} else {
			return forbidden();
		}
	}
	
	public static Result editJobs(Long jobId) {
		if (Secured.isOwnerOfJobOffer(jobId)) {
			JobOffer jobOffer = JobOffer.find.ref(jobId);
			Form<JobOffer> formToFill = form(JobOffer.class).fill(jobOffer); 
			User user = User.find.byId(request().username());
			return ok(editOffer.render(user, formToFill, jobOffer));
		} else {
			return forbidden();
		}
	}
	
}
