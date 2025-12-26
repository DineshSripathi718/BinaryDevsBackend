package com.binarydevs.Entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.binarydevs.Enums.ContactStatus;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

@Document(collection = "contacts")
public class Contacts {
	@Id
	@Field("_id")
    private String contactId; // MongoDB friendly
	@NotNull
	private String fullName;
	@Email
	private String email;
	private String phone;
	private String message;
	private ContactStatus status = ContactStatus.NEW;
	
	
	
	public String getContactId() {
		return contactId;
	}



	public void setContactId(String contactId) {
		this.contactId = contactId;
	}



	public String getFullName() {
		return fullName;
	}



	public void setFullName(String fullName) {
		this.fullName = fullName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public ContactStatus getStatus() {
		return status;
	}



	public void setStatus(ContactStatus status) {
		this.status = status;
	}



	@Override
	public String toString() {
		return "ContactFormDTO [contactId=" + contactId + ", fullName=" + fullName + ", email=" + email + ", phone="
				+ phone + ", message=" + message + "]";
	}
	
	
}
