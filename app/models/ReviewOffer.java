package models;
import java.sql.Blob;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import play.db.ebean.Model;


@Entity
public class ReviewOffer extends Model{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	public Long id;
	@OneToOne
	public JobOffer jobOffer;
	public Blob cv;
	public Blob coverLetter;
	
	@ManyToMany
	public List<User> reviewers;
	
	// -- Queries

	public static Model.Finder<Long, ReviewOffer> find = new Model.Finder<Long, ReviewOffer>(
			Long.class, ReviewOffer.class);


	public ReviewOffer(JobOffer jobOffer) {
		this.jobOffer = jobOffer;
	}
	
}
