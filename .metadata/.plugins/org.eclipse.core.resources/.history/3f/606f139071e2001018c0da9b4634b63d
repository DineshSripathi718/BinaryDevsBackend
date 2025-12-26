package com.binarydevs.Entities;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import com.binarydevs.Entities.enums.UserRole;

@Document(collection = "Admins")
public class AdminUser {
	private String _id;
	private String fullName;
	private String email;
	private String password;
	private Date createdAt;
	private String photoUrl;
	private String role = UserRole.ROLE_ADMIN.getDisplayName();
	private String refreshToken = null;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	@Override
	public String toString() {
		return "AdminUser [_id=" + _id + ", fullName=" + fullName + ", email=" + email + ", password=" + password
				+ ", createdAt=" + createdAt + ", photoUrl=" + photoUrl + ", role=" + role + ", refreshToken="
				+ refreshToken + "]";
	}
	
	
	
}
