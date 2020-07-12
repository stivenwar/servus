package com.servus.db;

public class ServiceItem {

	private String serviceType;
	private byte item;
	private String name;
	
	public ServiceItem() {
		
	}

	public ServiceItem(String serviceType, byte item, String name) {
		this.serviceType = serviceType;
		this.item = item;
		this.name = name;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviveType) {
		this.serviceType = serviveType;
	}

	public byte getItem() {
		return item;
	}

	public void setItem(byte item) {
		this.item = item;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
