package com.servus.db;

import java.sql.Date;
import java.sql.SQLException;

import com.servus.db.sql.PersonSQL;

import junit.framework.TestCase;

public class PersonTest extends TestCase
{
	Date date = Date.valueOf("1992-01-21");
	Person person = new Person("sebas@gmail.com","C","Sebastian","777777777","Spain","Valencia","Calla Olivereta","google.map",date);
	PersonSQL insertPerson=new PersonSQL();
	
	public void insert() throws SQLException {
		
		insertPerson.insertPerson(person);
	}
	
	public void select() throws SQLException {
		insertPerson.selectPerson();
	}
	
	public void testName() {
		
		String user = person.getName();
		
		assertEquals("Sebastian", user);
		
		
	}
	
	public void testUserId() {
		String userId = person.getUserId();
		
		assertEquals("sebas@gmail.com",userId);
		
	}

	
	
	
}


