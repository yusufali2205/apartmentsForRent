package com.major.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Property {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String propertyID;
	
	@Column(nullable=false)
	private String propertyName;
	
	@Column(nullable=false)
	private String type;
	
	@Column(nullable=false)
	private int price;
	
	private int floorArea;
	
	@Column(nullable=false)
	private Date availableFrom;
	
	@Column(nullable=false)
	private int bhk;
	
	@Column(nullable=false)
	private User postedBy;
	
	private long geoLat;
	private long geoLong;
	private String pictureLink;
	private boolean furnished;
	
	@Column(nullable=false)
	private String address;
	
	private boolean approved;
	
	@Column(nullable=false)
	private Date postedOn;
	
	protected Property(){}
	
	public String getPropertyID() {
		return propertyID;
	}
	public void setPropertyID(String propertyID) {
		this.propertyID = propertyID;
	}
	public String getPropertyName() {
		return propertyName;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getFloorArea() {
		return floorArea;
	}
	public void setFloorArea(int floorArea) {
		this.floorArea = floorArea;
	}
	public Date getAvailableFrom() {
		return availableFrom;
	}
	public void setAvailableFrom(Date availableFrom) {
		this.availableFrom = availableFrom;
	}
	public int getBhk() {
		return bhk;
	}
	public void setBhk(int bhk) {
		this.bhk = bhk;
	}
	public User getPostedBy() {
		return postedBy;
	}
	public void setPostedBy(User postedBy) {
		this.postedBy = postedBy;
	}
	public long getGeoLat() {
		return geoLat;
	}
	public void setGeoLat(long geoLat) {
		this.geoLat = geoLat;
	}
	public long getGeoLong() {
		return geoLong;
	}
	public void setGeoLong(long geoLong) {
		this.geoLong = geoLong;
	}
	public String getPictureLink() {
		return pictureLink;
	}
	public void setPictureLink(String pictureLink) {
		this.pictureLink = pictureLink;
	}
	public boolean isFurnished() {
		return furnished;
	}
	public void setFurnished(boolean furnished) {
		this.furnished = furnished;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	public Date getPostedOn() {
		return postedOn;
	}
	public void setPostedOn(Date postedOn) {
		this.postedOn = postedOn;
	}
	
}
