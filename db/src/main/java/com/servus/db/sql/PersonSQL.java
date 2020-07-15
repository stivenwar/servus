package com.servus.db.sql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.servus.db.Conn;
import com.servus.db.Person;

public class PersonSQL
{

	public Person selectPerson() throws SQLException {
		
		Person person=null;
		Conn conn = new Conn();
		Connection connection = conn.getConnection();
		if(connection != null) {
			PreparedStatement ps=null;
			ResultSet rs=null;
			ps = connection.prepareStatement("SELECT * FROM Person");
			rs = ps.executeQuery();
			System.out.println("select");
			while(rs.next()){
				person = new Person();
				person.setUserId(rs.getString("userId"));
				person.setType(rs.getString("type"));
				person.setName(rs.getString("name"));
				person.setMobile(rs.getString("mobile"));
				person.setCountry(rs.getString("country"));
				person.setCity(rs.getString("city"));
				person.setAddress(rs.getString("address"));
				person.setMap(rs.getString("map"));
				person.setBirthday(rs.getDate("birthday"));
				
			
			}
		}
		return person;
	}
	
	public Person insertPerson(Person p) throws SQLException {
		
		Person person = null;
		Conn conn =new Conn();
		Connection connection = conn.getConnection();
		
		if(connection !=null) {
			PreparedStatement ps = null;
			ps = connection.prepareStatement("INSERT INTO Person values (?,?,?,?,?,?,?,?,?)");
			ps.setString(1,p.getUserId());
			ps.setString(2,p.getType());
			ps.setString(3,p.getName());
			ps.setString(4,p.getMobile());
			ps.setString(5,p.getCountry());
			ps.setString(6,p.getCity());
			ps.setString(7,p.getAddress());
			ps.setString(8,p.getMap());
			ps.setDate(9,p.getBirthday());
			ps.executeUpdate();
			System.out.println("insert");
				
		}
		
		return person;
	}
	
	public void updatePerson(String userId,String type, String name, String mobile, String country, String city, String address, String map, Date birthday) throws SQLException {
		
		Conn conn =new Conn();
		Connection connection = conn.getConnection();
		
		if(connection !=null) {
			PreparedStatement ps = null;
			ps = connection.prepareStatement(" UPDATE Person SET type=?,name=?, mobile=?, country=?, city=?, address=?, map=?, birthday=? WHERE userId=? ");
			ps.setString(1,type);
			ps.setString(2,name);
			ps.setString(3,mobile);
			ps.setString(4,country);
			ps.setString(5,city);
			ps.setString(6,address);
			ps.setString(7,map);
			ps.setDate(8,birthday);
			ps.setString(9,userId);
			ps.executeUpdate();
			System.out.println("update");
				
		}
		
	}

	public void deletePerson (String userId) throws SQLException {
	
		Conn conn =new Conn();
		Connection connection = conn.getConnection();
		
		if(connection !=null) {
			PreparedStatement ps = null;
			ps = connection.prepareStatement(" DELETE FROM PERSON WHERE userId = ? ");
			ps.setString(1,userId);
			System.out.println("delete");
				
		}
	
	
	}
	
}


