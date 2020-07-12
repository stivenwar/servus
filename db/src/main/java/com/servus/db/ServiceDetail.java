package com.servus.db;

public class ServiceDetail {

	private int serviceId;
	private byte itemId;
	private String name;
	private String value;
	
	public ServiceDetail() {
		
	}

	public ServiceDetail(int serviceId, byte itemId, String name, String value) {
		this.serviceId = serviceId;
		this.itemId = itemId;
		this.name = name;
		this.value = value;
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public byte getItemId() {
		return itemId;
	}

	public void setItemId(byte itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
