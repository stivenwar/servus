package com.servus.db.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.servus.db.Conn;
import com.servus.db.ServiceType;

public class ServiceTypeSQL {

public ServiceType selectServiceType() throws SQLException {
		
		ServiceType serType = null;
		Conn conn = new Conn();
		Connection connection=conn.getConnection();
		
		if(connection != null) {
			PreparedStatement ps = null;
			ResultSet rs = null;
			
			ps = connection.prepareStatement("SELECT * FROM ServiceType");
			rs = ps.executeQuery();
			System.out.println("select");
		
			while(rs.next()) {
				serType =new ServiceType();
				serType.setServiceType(rs.getString("serviceType"));  
				serType.setName(rs.getString("name"));
				
			}
		
		}
		return serType;
	}	
	
public ServiceType insertServiceType() throws SQLException {
		
	    ServiceType  serType = null;
		Conn conn =new Conn();
		Connection connection = conn.getConnection();
		
		if(connection !=null) {
			PreparedStatement ps = null;
			serType = new ServiceType();
			ps = connection.prepareStatement("INSERT INTO ServiceType values (?,?,?)");
			ps.setString(1,serType.getServiceType());
			ps.setString(3,serType.getName());
			
			ps.executeUpdate();
			System.out.println("insert");
				
		}
		
		return serType;
	}
	
	public void updateServiceType(String serviceType, String name) throws SQLException {
		
		Conn conn =new Conn();
		Connection connection = conn.getConnection();
		
		if(connection !=null) {
			PreparedStatement ps = null;
			ps = connection.prepareStatement(" UPDATE SERVICETYPE SET  name = ?  WHERE serviceType = ? ");
			ps.setString(1,serviceType);
			ps.setString(3,name);
			ps.executeUpdate();
			System.out.println("update");
				
		}
		
	}

	public void deleteServiceType (String serviceType) throws SQLException {
	
		Conn conn =new Conn();
		Connection connection = conn.getConnection();
		
		if(connection !=null) {
			PreparedStatement ps = null;
			ps = connection.prepareStatement(" DELETE FROM SERVICETYPE WHERE serviceType = ? ");
			ps.setString(1,serviceType);
			System.out.println("delete");
				
		}
	
	
	}
	
}
