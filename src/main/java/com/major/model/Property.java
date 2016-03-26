package com.major.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Property {
	@Id
	@Column(name="PROPERTY_ID", nullable=false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long propertyId;
	
	@Column(name="PROPERTY_NAME", nullable=false)
	private String propertyName;
	
	@Column(name="TYPE", nullable=false)
	private String type;
	
	@Column(name="PRICE", nullable=false)
	private int price;
	
	@Column(name="FLOOR_AREA")
	private int floorArea;
	
	@Column(name="AVAILABLE_FROM", nullable=false)
	private Date availableFrom;
	
	@Column(name="BHK", nullable=false)
	private int bhk;
	
	@Column(name="USER_ID", nullable=false)
	private long userId;
	
	@ManyToOne(optional=false)
    @JoinColumn(name="USER_ID",referencedColumnName="USER_ID", insertable=false, updatable=false)
	private User postedByUser;
	
	@OneToMany
    @JoinColumn(name="PROPERTY_ID",referencedColumnName="PROPERTY_ID", insertable=false, updatable=false)
	private List<Review> reviewsList;
	
	@Column(name="GEO_LAT")
	private String geoLat;
	
	@Column(name="GEO_LONG")
	private String geoLong;
	
	@Column(name="PICTURE_LINK")
	private String pictureLink;
	
	@Column(name="FURNISHED")
	private boolean furnished;
	
	@Column(name="ADDRESS", nullable=false)
	private String address;
	
	@Column(name="APPROVED")
	private boolean approved;
	
	@Column(name="POSTED_ON", nullable=false)
	private Date postedOn;
	
	@Column(name="PLACE_ID", nullable=false)
	private String placeId;
	
	protected Property(){}
	
	public long getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(long propertyId) {
		this.propertyId = propertyId;
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
	public String getGeoLat() {
		return geoLat;
	}
	public void setGeoLat(String geoLat) {
		this.geoLat = geoLat;
	}
	public String getGeoLong() {
		return geoLong;
	}
	public void setGeoLong(String geoLong) {
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
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public User getPostedByUser() {
		return postedByUser;
	}

	public void setPostedByUser(User postedByUser) {
		this.postedByUser = postedByUser;
	}

	public String getPlaceId() {
		return placeId;
	}

	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}
	
}
