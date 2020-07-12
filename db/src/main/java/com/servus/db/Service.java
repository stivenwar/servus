package com.servus.db;

public class Service {

	private int serviceId;
	private String adminId;
	private String serviceType;
	private String name;
	private String description;
	private String mobile;
	private String country;
	private String city;
	private String address;
	private String map;
	private boolean available;
	
	public Service() {
		
	}

	public Service(int serviceId, String adminId, String serviceType, String name, String description, String mobile,
			String country, String city, String address, String map, boolean available) {
		this.serviceId = serviceId;
		this.adminId = adminId;
		this.serviceType = serviceType;
		this.name = name;
		this.description = description;
		this.mobile = mobile;
		this.country = country;
		this.city = city;
		this.address = address;
		this.map = map;
		this.available = available;
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	
	
}
