package com.servus.db;

import java.sql.SQLException;

import com.servus.db.sql.ServiceTypeSQL;

import junit.framework.TestCase;

public class ServiceTypeTest extends TestCase{
	
	ServiceType servType = new ServiceType("PELU","PELUQUERIA");
	ServiceTypeSQL st = new ServiceTypeSQL();
	
    public void insert() throws SQLException {
		
		st.insertServiceType(servType);
	}
	
	public void select() throws SQLException {
		st.selectServiceType();
	}
	
	public void testName() {
		
		String service = servType.getName();
		
		assertEquals("PELUQUERIA", service);
		
		
	}
	

}
