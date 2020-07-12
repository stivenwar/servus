package com.servus.db;

import java.sql.Date;

public class Person {
	
	private String userId;
	private String type;
	private String name;
	private String mobile;
	private String country;
	private String city;
	private String address;
	private String map;
	private Date birthday;
	
	public Person() {
		
	}

	public Person(String userId, String type, String name, String mobile, String country, String city, String address,
			String map, Date birthday) {
		this.userId = userId;
		this.type = type;
		this.name = name;
		this.mobile = mobile;
		this.country = country;
		this.city = city;
		this.address = address;
		this.map = map;
		this.birthday = birthday;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMap() {
		return map;
	}

	public void setMap(String map) {
		this.map = map;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
	
	
	
}


