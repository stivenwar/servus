package com.servus.db;

public class ServiceType {

	private String serviceType;
	private String name;
	
	public ServiceType() {
		
	}

	public ServiceType(String serviceType, String name) {
		this.serviceType = serviceType;
		this.name = name;
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
	
	
}