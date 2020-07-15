package com.servus.db;

import java.sql.SQLException;

import com.servus.db.sql.ServiceSQL;

import junit.framework.TestCase;

public class ServiceTest extends TestCase{

	Service service = new Service(1,"meibol@gmail.com","PELU","PELUQUERIA","peluqueria lowcost","666666666","Spain","Valencia","Calle aurora 34","google.map",true);
	ServiceSQL s = new ServiceSQL();
	
public void insert() throws SQLException {
		
		s.insertService(service);
	}
	
	public void select() throws SQLException {
		s.selectService();
	}
	
	public void testAvailable() {
		
		boolean trueOrFalse = service.isAvailable();
		
		assertEquals("true",trueOrFalse);
		
		
	}
	
	public void testAdmin() {
		String adminid = service.getAdminId();
		
		assertEquals("meibol@gmail.com",adminid);
		
	}
}
