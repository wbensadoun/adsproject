package com.esic.ads.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserDto {

	private String login;
	
	private String email;
	
	@JsonIgnore
	private String password;
	
	private long id;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
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

	public UserDto(String login, String email, String password) {
		super();
		this.login = login;
		this.email = email;
		this.password = password;
	}

	public UserDto() {
		super();
	}

	public UserDto(long id, String email, String login) {
		this.id = id;
		this.email = email;
		this.login = login;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
