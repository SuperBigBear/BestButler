package com.gwz.entity;

import java.io.Serializable;
import java.util.UUID;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class UserInfo extends BaseEntity {

	public UserInfo() {
		// TODO Auto-generated constructor stub
	}

	private int gender;
	private String firstName;
	private String lastName;
	private String loginName;
	private String passWord;
	private String address;
	private String email;

 
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
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
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	

}
