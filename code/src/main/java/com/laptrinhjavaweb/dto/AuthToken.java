package com.laptrinhjavaweb.dto;

import com.laptrinhjavaweb.constant.SystemConstant;

public class AuthToken {
	
	private String token;

	private String uri;
	
	public AuthToken(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}
}
