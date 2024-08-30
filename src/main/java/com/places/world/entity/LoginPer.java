package com.places.world.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoginPer {
	
	@Id
	private String userName;
	private String Password;
	
	public LoginPer() {
		super();

	}
	
	public LoginPer(String userName, String password) {
		super();
		this.userName = userName;
		Password = password;
	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	@Override
	public String toString() {
		return "LoginPer [userName=" + userName + ", Password=" + Password + "]";
	}
	
	
	

}
