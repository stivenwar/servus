package com.servus.db;

import java.sql.Date;
import java.sql.Time;

public class Reserve {
 
	private int reserveId;
	private String userId;
	private int serviceId;
	private Date reserveDate;
	private Time reserveStart;
	private Time reserveEnd;
	private String status;
	private byte score;
	
	public Reserve() {
	}

	public Reserve(int reserveId, String userId, int serviceId, Date reserveDate, Time reserveStart, Time reserveEnd,
			String status, byte score) {
		this.reserveId = reserveId;
		this.userId = userId;
		this.serviceId = serviceId;
		this.reserveDate = reserveDate;
		this.reserveStart = reserveStart;
		this.reserveEnd = reserveEnd;
		this.status = status;
		this.score = score;
	}

	public int getReserveId() {
		return reserveId;
	}

	public void setReserveId(int reserveId) {
		this.reserveId = reserveId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public Date getReserveDate() {
		return reserveDate;
	}

	public void setReserveDate(Date reserveDate) {
		this.reserveDate = reserveDate;
	}

	public Time getReserveStart() {
		return reserveStart;
	}

	public void setReserveStart(Time reserveStart) {
		this.reserveStart = reserveStart;
	}

	public Time getReserveEnd() {
		return reserveEnd;
	}

	public void setReserveEnd(Time reserveEnd) {
		this.reserveEnd = reserveEnd;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public byte getScore() {
		return score;
	}

	public void setScore(byte score) {
		this.score = score;
	}

	
	
	
	
	
}
