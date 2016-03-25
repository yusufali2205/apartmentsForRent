package com.major.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Review {
	@Id
	@Column(name="REVIEW_ID", nullable=false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long reviewId;
	
	@Column(name="PROPERTY_ID", nullable=false)
	private long propertyId;
	
	/* user who posted the review/rating */
	@Column(name="USER_ID", nullable=false)
	private long userId;
	
	/* There can be an entry with only rating but review null */
	@Column(name="REVIEW")
	private String review;
	
	/* integer rating between 1 to 5 */
	@Column(name="RATING", nullable=false)
	private int rating;
	
	@ManyToOne(optional=false)
    @JoinColumn(name="USER_ID",referencedColumnName="USER_ID", insertable=false, updatable=false)
    private User postedByUser;
	
	@ManyToOne(optional=false)
    @JoinColumn(name="PROPERTY_ID",referencedColumnName="PROPERTY_ID", insertable=false, updatable=false)
    private Property property;
	
	protected Review(){}
	
	public long getReviewId() {
		return reviewId;
	}
	public void setReviewId(long reviewId) {
		this.reviewId = reviewId;
	}
	public long getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(long propertyId) {
		this.propertyId = propertyId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public User getPostedByUser() {
		return postedByUser;
	}
	public void setPostedByUser(User postedByUser) {
		this.postedByUser = postedByUser;
	}
	public Property getProperty() {
		return property;
	}
	public void setProperty(Property property) {
		this.property = property;
	}

}
