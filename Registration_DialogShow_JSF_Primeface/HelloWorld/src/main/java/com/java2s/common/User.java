package com.java2s.common;

import java.util.LinkedHashMap;
import java.util.Map;

public class User{
	private String name;
	private String email;
	private String password;
	private String gender;
	private String address;

	private String favItem;
	public String getFavItem() {
		return favItem;
	}

	public void setFavItem(String favItem) {
		this.favItem = favItem;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
