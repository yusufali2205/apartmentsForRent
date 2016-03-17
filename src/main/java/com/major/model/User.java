package com.major.model;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Email;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
public class User implements UserDetails {
	/**
   * 
   */
  private static final long serialVersionUID = -873924739815021873L;

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
	@Email
	private String email;
	
	/* phone number cannot be null and cannot repeat */
	@Column(name="PHONE_NO", unique=true, nullable=false)
	private long phoneNo;
	
	@Column(name="CITY")
	private String city;
	
	/* Client / Administrator */
	@Column(name="USER_TYPE", nullable=false)
	private String userType;
	
	@Column(name="PASSWORD", nullable=false)
  private String password;
	
	public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

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

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    SimpleGrantedAuthority auth = new SimpleGrantedAuthority("ROLE_USER"); 
    return Arrays.asList(new SimpleGrantedAuthority[]{auth});
  }

  @Override
  public String getUsername() {
    return email;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }
	
}
