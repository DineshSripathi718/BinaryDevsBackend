package com.binarydevs.DTOs;

public class RefreshDTO {
	private String refreshToken;

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	@Override
	public String toString() {
		return "RefreshDTO [refreshToken=" + refreshToken + "]";
	}
	
	
}
