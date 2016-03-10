package com.major.model;

import java.sql.Date;
import java.util.ArrayList;

public class Property {
	private String propertyID;
	private String propertyName;
	private String type;
	private int price;
	private int floorArea;
	private Date availableFrom;
	private int bhk;
	private User postedBy;
	private long geoLat;
	private long geoLong;
	private String pictureLink;
	private boolean furnished;
	private String address;
	private boolean approved;
	private Date postedOn;
	private long rating;
	private ArrayList<Review> reveiws;
	
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
	public long getRating() {
		return rating;
	}
	public void setRating(long rating) {
		this.rating = rating;
	}
	public ArrayList<Review> getReveiws() {
		return reveiws;
	}
	public void setReveiws(ArrayList<Review> reveiws) {
		this.reveiws = reveiws;
	}
}
