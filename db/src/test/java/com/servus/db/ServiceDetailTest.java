package com.servus.db;

import java.sql.SQLException;

import com.servus.db.sql.ServiceDetailSQL;

import junit.framework.TestCase;

public class ServiceDetailTest extends TestCase{
	
	ServiceDetail servDetail = new ServiceDetail (1,(byte)1,"PELUQUERIA","30");
	ServiceDetailSQL sd =new ServiceDetailSQL();
	
	public void insert() throws SQLException {
		
		sd.insertServiceDetail(servDetail);
	}
	
	public void select() throws SQLException {
		sd.selectServiceDetail();
	}
	
	public void testName() {
		
		String service = servDetail.getName();
		
		assertEquals("PELUQUERIA", service);
		
		
	}
	


}
