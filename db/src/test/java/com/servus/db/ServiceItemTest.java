package com.servus.db;

import java.sql.SQLException;

import com.servus.db.sql.ServiceItemSQL;

import junit.framework.TestCase;

public class ServiceItemTest extends TestCase{
	
	 ServiceItem servItem = new  ServiceItem("PELU",(byte)1,"tinte");
	 ServiceItemSQL si =new ServiceItemSQL();

    public void insert() throws SQLException {
		
    	si.insertServiceItem(servItem);
	}
	
	public void select() throws SQLException {
		si.selectServiceItem();
	}
	
	public void testName() {
		
		String service = servItem.getName();
		
		assertEquals("tinte", service);
		
		
	}
	

}
