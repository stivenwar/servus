package com.servus.db;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;

import com.servus.db.sql.ReserveSQL;

import junit.framework.TestCase;

public class ReserveTest extends TestCase{

	Date reserveDate = Date.valueOf("2020-12-01");
	Time timeStart = Time.valueOf("18:00:00");
	Time timeEnd = Time.valueOf("20:00:00");
	
	
	Reserve reserve = new Reserve(1,"karen@gmail.com",1,reserveDate,timeStart,timeEnd,"INPROGRESS",(byte)5);
	ReserveSQL insertReserve = new ReserveSQL();
	
	public void insert() throws SQLException {
		
		insertReserve.insertReserve(reserve);
	}
	
	public void select() throws SQLException {
		
		insertReserve.selectReserve();
	}
	
	
	public void testUserId() {
		String userId = reserve.getUserId();
		
		assertEquals("karen@gmail.com",userId);
		
	}
	
}
