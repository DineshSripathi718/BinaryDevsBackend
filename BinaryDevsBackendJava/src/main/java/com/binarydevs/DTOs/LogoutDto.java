package com.binarydevs.DTOs;

public class LogoutDto {
	private String email;
	private String refreshToken;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRefreshToken() {
		return refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	@Override
	public String toString() {
		return "LogoutDto [email=" + email + ", refreshToken=" + refreshToken + "]";
	}
	
	
}
