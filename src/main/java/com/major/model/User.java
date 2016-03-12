package com.major.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@Column(name="USER_ID", nullable=false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;
	
	@Column(name="FIRST_NAME", nullable=false)
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	/* email id cannot be null and cannot repeat */
	@Column(name="EMAIL", unique=true, nullable=false)
	private String email;
	
	/* phone number cannot be null and cannot repeat */
	@Column(name="PHONE_NO", unique=true, nullable=false)
	private long phoneNo;
	
	@Column(name="CITY")
	private String city;
	
	/* Client / Administrator */
	@Column(name="USER_TYPE", nullable=false)
	private String userType;
	
	protected User(){}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
}
