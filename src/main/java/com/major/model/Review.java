package com.major.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Review {
	@Column(nullable=false)
	private String propertyId;
	
	/* user who posted the review/rating */
	@Column(nullable=false)
	private String userId;
	
	/* There can be an entry with only rating but review null */
	private String review;
	
	/* integer rating between 1 to 5 */
	@Column(nullable=false)
	private int rating;
	
	protected Review(){}
	
	public String getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(String propertyId) {
		this.propertyId = propertyId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
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
	
}
