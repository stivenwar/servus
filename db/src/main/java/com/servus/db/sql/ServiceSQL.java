package com.servus.db.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.servus.db.Conn;
import com.servus.db.Service;

public class ServiceSQL {

public Service selectService() throws SQLException {
		
	    Service service=null;
		Conn conn = new Conn();
		Connection connection = conn.getConnection();
		if(connection != null) {
			PreparedStatement ps=null;
			ResultSet rs=null;
			ps = connection.prepareStatement("SELECT * FROM Service");
			rs = ps.executeQuery();
			System.out.println("select");
			while(rs.next()){
				service = new Service();
				service.setServiceId(rs.getInt("serviceId"));
				service.setAdminId(rs.getString("adminId"));
				service.setServiceType(rs.getString("serviceType"));
				service.setName(rs.getString("name"));
				service.setDescription(rs.getString("description"));
				service.setMobile(rs.getString("mobile"));
				service.setCountry(rs.getString("country"));
				service.setCity(rs.getString("city"));
				service.setAddress(rs.getString("address"));
				service.setMap(rs.getString("map"));
				service.setAvailable(rs.getBoolean("available"));
				
			
			}
		}
		return service;
	}
	
	public Service insertService() throws SQLException {
		
		Service service = null;
		Conn conn =new Conn();
		Connection connection = conn.getConnection();
		
		if(connection !=null) {
			PreparedStatement ps = null;
		    service = new Service();
			ps = connection.prepareStatement("INSERT INTO Service values (?,?,?,?,?,?,?,?,?,?,?)");
			ps.setInt(1,service.getServiceId());
			ps.setString(2,service.getAdminId());
			ps.setString(3,service.getServiceType());
			ps.setString(4,service.getName());
			ps.setString(5,service.getDescription());
			ps.setString(6,service.getMobile());
			ps.setString(7,service.getCountry());
			ps.setString(8,service.getCity());
			ps.setString(9,service.getAddress());
			ps.setString(10,service.getMap());
			ps.setBoolean(11,service.isAvailable());
			ps.executeUpdate();
			System.out.println("insert");
				
		}
		
		return service;
	}
	
	public void updateService(int serviceId, String name, String description, String mobile,
			String country, String city, String address, String map, boolean available) throws SQLException {
		
		Conn conn =new Conn();
		Connection connection = conn.getConnection();
		
		if(connection !=null) {
			PreparedStatement ps = null;
			ps = connection.prepareStatement(" UPDATE Service SET name=?,decription =?, mobile=?, country=?, city=?, address=?, map=?, available=? WHERE serviceId=? ");
			ps.setString(1,name);
			ps.setString(2,description);
			ps.setString(3,mobile);
			ps.setString(4,country);
			ps.setString(5,city);
			ps.setString(6,address);
			ps.setString(7,map);
			ps.setBoolean(8,available);
			ps.setInt(9,serviceId);
			ps.executeUpdate();
			System.out.println("update");
				
		}
		
	}

	public void deleteService (String serviceId) throws SQLException {
	
		Conn conn =new Conn();
		Connection connection = conn.getConnection();
		
		if(connection !=null) {
			PreparedStatement ps = null;
			ps = connection.prepareStatement(" DELETE FROM Service WHERE serviceId = ? ");
			ps.setString(1,serviceId);
			System.out.println("delete");
				
		}
	
	
	}
	
}
