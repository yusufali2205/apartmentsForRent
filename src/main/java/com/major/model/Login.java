package com.major.model;

import javax.persistence.Entity;

@Entity
public class Login {
	private long phoneNo;
	private String email;
	private String password;
	
	public Login(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public Login(long phoneNo, String password) {
		super();
		this.phoneNo = phoneNo;
		this.password = password;
	}
	
	
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
