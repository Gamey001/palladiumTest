package io.palladium.gamalssolution.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	private String username;
	private String email;
	private String phoneNumber;
	private String dateCreated;
	private Boolean status;

	public User() {
	}

	public User(String username, String email, String phoneNumber, String dateCreated, Boolean status) {
		super();
		this.username = username;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.dateCreated = dateCreated;
		this.status = status;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}
