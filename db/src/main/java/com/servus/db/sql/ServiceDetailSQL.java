package com.servus.db.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.servus.db.Conn;
import com.servus.db.ServiceDetail;



public class ServiceDetailSQL {

	public ServiceDetail selectServiceDetail() throws SQLException {
		
		ServiceDetail sd=null;
		Conn conn = new Conn();
		Connection connection = conn.getConnection();
		if(connection != null) {
			PreparedStatement ps=null;
			ResultSet rs=null;
			ps = connection.prepareStatement("SELECT * FROM ServiceDetail");
			rs = ps.executeQuery();
			while(rs.next()){
				sd = new ServiceDetail();
				sd.setServiceId(rs.getInt("serviceId"));
				sd.setItemId(rs.getByte("itemId"));
				sd.setName(rs.getString("name"));
				sd.setValue(rs.getString("value"));
				System.out.println("select");
			
			}
		}
		return sd;
	}
	
	public ServiceDetail insertServiceDetail(ServiceDetail sd) throws SQLException {
		
	
		Conn conn =new Conn();
		Connection connection = conn.getConnection();
		
		if(connection !=null) {
			PreparedStatement ps = null;
			ps = connection.prepareStatement("INSERT INTO ServiceDetail values (?,?,?,?,?,?,?)");
			ps.setInt(1,sd .getServiceId());
			ps.setByte(2,sd .getItemId());
			ps.setString(3,sd.getName());
			ps.setString(4,sd.getValue());

			ps.executeUpdate();
			System.out.println("insert");
				
		}
		
		return sd;
	}
	
	public void updateServiceDetail(int serviceId, Byte itemId, String name, String value) throws SQLException {
		
		Conn conn =new Conn();
		Connection connection = conn.getConnection();
		
		if(connection !=null) {
			PreparedStatement ps = null;
			ps = connection.prepareStatement(" UPDATE ServiceDetail SET  name = ?, value = ? WHERE serviceId = ?  ");
			ps.setString(1,name);
			ps.setString(2,value);
			ps.setInt(3,serviceId);
			ps.executeUpdate();
			System.out.println("update");
				
		}
		
	}

	public void deleteServiceDetail (String serviceId) throws SQLException {
	
		Conn conn =new Conn();
		Connection connection = conn.getConnection();
		
		if(connection !=null) {
			PreparedStatement ps = null;
			ps = connection.prepareStatement(" DELETE FROM ServiceDetail WHERE serviceId = ? ");
			ps.setString(1,serviceId);
			System.out.println("delete");
				
		}
	
	
	}
}
