package com.servus.db.sql;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.servus.db.Conn;
import com.servus.db.ServiceItem;

public class ServiceItemSQL {

	public ServiceItem selectServiceItem() throws SQLException {
		
		ServiceItem serItem = null;
		Conn conn = new Conn();
		Connection connection=conn.getConnection();
		
		if(connection != null) {
			PreparedStatement ps = null;
			ResultSet rs = null;
			
			ps = connection.prepareStatement("SELECT * FROM ServiceItem");
			rs = ps.executeQuery();
			System.out.println("select");
		
			while(rs.next()) {
				serItem =new ServiceItem();
				serItem.setServiceType(rs.getString("serviceType")); 
				serItem.setItem(rs.getByte("itemId"));  
				serItem.setName(rs.getString("name"));
				
			}
		
		}
		return serItem;
	}	
	
public ServiceItem insertServiceItem() throws SQLException {
		
	    ServiceItem  serItem = null;
		Conn conn =new Conn();
		Connection connection = conn.getConnection();
		
		if(connection !=null) {
			PreparedStatement ps = null;
			serItem = new ServiceItem ();
			ps = connection.prepareStatement("INSERT INTO ServiceItem values (?,?,?)");
			ps.setString(1,serItem.getServiceType());
			ps.setByte(2,serItem.getItem());
			ps.setString(3,serItem.getName());
			
			ps.executeUpdate();
			System.out.println("insert");
				
		}
		
		return serItem;
	}
	
	public void updateServiceItem(String serviceType,Byte item, String name) throws SQLException {
		
		Conn conn =new Conn();
		Connection connection = conn.getConnection();
		
		if(connection !=null) {
			PreparedStatement ps = null;
			ps = connection.prepareStatement(" UPDATE Person SET item = ?, name = ?  WHERE serviceType = ? ");
			ps.setString(1,serviceType);
			ps.setByte(2,item);
			ps.setString(3,name);
			ps.executeUpdate();
			System.out.println("update");
				
		}
		
	}

	public void deleteServiceItem (String serviceType) throws SQLException {
	
		Conn conn =new Conn();
		Connection connection = conn.getConnection();
		
		if(connection !=null) {
			PreparedStatement ps = null;
			ps = connection.prepareStatement(" DELETE FROM ServiceItem WHERE serviceType = ? ");
			ps.setString(1,serviceType);
			System.out.println("delete");
				
		}
	
	
	}
	
}
