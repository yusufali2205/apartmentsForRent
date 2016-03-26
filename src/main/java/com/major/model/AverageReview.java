package com.major.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class AverageReview {
	private long propertyId;
	
	private long avgRating;
	
	private long ratingCount;

	public AverageReview(long p, long avgRating, long ratingCount) {
		super();
		this.propertyId = p;
		this.avgRating = avgRating;
		this.ratingCount = ratingCount;
	}
	
	
	
}
