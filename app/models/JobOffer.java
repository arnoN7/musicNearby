package models;

import java.util.*;

import javax.persistence.*;

import com.avaje.ebean.Page;

import play.data.format.Formats;
import play.data.validation.Constraints.Required;
import play.db.ebean.*;

@Entity
public class JobOffer extends Model {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	public Long id;

	@Required
	@Formats.NonEmpty
	public String jobName;
	public String companyName;

	@Lob
	public String jobDescription;
	public String jobURL;
	@ManyToOne
	public User applicant;
	@ManyToMany
	public List<User> reviewers = new ArrayList<User>();
	public Status status;
	@OneToOne
	public ReviewOffer review;

	public JobOffer(String jobName, User applicant, ReviewOffer review) {
		this.jobName = jobName;
		this.applicant = applicant;
		this.review = review;
	}

	// -- Queries

	public static Model.Finder<Long, JobOffer> find = new Model.Finder<Long, JobOffer>(
			Long.class, JobOffer.class);

	
	/**
	 * Get Job offers recorded by A User
	 */
	public static List<JobOffer> getjobOffersFromUser(String userEmail) {
		
		return find.where().eq("applicant.email", userEmail).findList();
	}
	
    /**
     * Return a page of jobs
     *
     * @param page Page to display
     * @param pageSize Number of computers per page
     * @param sortBy Computer property used for sorting
     * @param order Sort order (either or asc or desc)
     * @param filter Filter applied on the name column
     */
    public static Page<JobOffer> getSortedJobPage(String userEmail, int page, int pageSize, String sortBy, String order, String filter) {
        return 
            find.where().eq("applicant.email", userEmail)
                .ilike("name", "%" + filter + "%")
                .orderBy(sortBy + " " + order)
                .fetch("company")
                .findPagingList(pageSize)
                .getPage(page);
    }


	public static boolean isOwner(Long jobId, String username) {
		return find.where().eq("applicant.email", username).eq("id", jobId)
				.findRowCount() > 0;
	}
	
	public String toString() {
		if(this.status == Status.New)
		{
			return "<tr class=\"success\">" + "<td>" + this.jobName + "</td>" + "<td>" + this.companyName + "</td>";
		}
		return "<tr>" + "<td>" + this.jobName + "</td>" + "<td>" + this.companyName + "</td>";
	}
	
}
