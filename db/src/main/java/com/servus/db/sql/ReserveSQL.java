package com.servus.db.sql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

import com.servus.db.Conn;
import com.servus.db.Reserve;

public class ReserveSQL {

public Reserve selectReserve() throws SQLException {
		
		Reserve reserve=null;
		Conn conn = new Conn();
		Connection connection = conn.getConnection();
		if(connection != null) {
			PreparedStatement ps=null;
			ResultSet rs=null;
			ps = connection.prepareStatement("SELECT * FROM Reserve ");
			rs = ps.executeQuery();
			while(rs.next()){
				reserve = new Reserve();
				reserve.setReserveId(rs.getInt("reserveId"));
				reserve.setServiceId(rs.getInt("serviceId"));
				reserve.setUserId(rs.getString("userId"));
				reserve.setReserveDate(rs.getDate("reserveDate"));
				reserve.setReserveStart(rs.getTime("reserveStart"));
				reserve.setReserveEnd(rs.getTime("reserveEnd"));
				reserve.setStatus(rs.getString("status"));
				reserve.setScore(rs.getByte("score"));
				System.out.println("select");
			
			}
		}
		return reserve;
	}
	
	public Reserve insertReserve(Reserve r) throws SQLException {
		
		Conn conn =new Conn();
		Connection connection = conn.getConnection();
		
		if(connection !=null) {
			PreparedStatement ps = null;
			ps = connection.prepareStatement("INSERT INTO reserve values (?,?,?,?,?,?,?,?)");
			ps.setInt(1,r.getReserveId());
			ps.setString(2,r.getUserId());
			ps.setInt(3,r.getServiceId());
			ps.setDate(4,r.getReserveDate());
			ps.setTime(5,r.getReserveStart());
			ps.setTime(6,r.getReserveEnd());
			ps.setString(7,r.getStatus());
			ps.setByte(8,r.getScore());
			ps.executeUpdate();
			System.out.println("insert");
				
		}
		
		return r;
	}
	
	public Reserve updateReserve(Date reserveDate, Time reserveStart, Time reserveEnd, String status, Byte score) throws SQLException {
		
		Conn conn =new Conn();
		Connection connection = conn.getConnection();
		Reserve reserve =null;
		
		if(connection !=null) {
			PreparedStatement ps = null;
			reserve = new Reserve();
			ps = connection.prepareStatement(" UPDATE Reserve SET reserveDate=?, reserveStart=?, reserveEnd=?, status=?, score=? where reserveId=?");
			ps.setDate(1,reserveDate);
			ps.setTime(2,reserveStart);
			ps.setTime(3,reserveEnd);
			ps.setString(4,status);
			ps.setByte(5,score);
			ps.executeUpdate();
			System.out.println("update");
				
		}
		return reserve;
	}

	public void deleteReserve (String reserveId) throws SQLException {
	
		Conn conn =new Conn();
		Connection connection = conn.getConnection();
		
		if(connection !=null) {
			PreparedStatement ps = null;
			ps = connection.prepareStatement(" DELETE FROM Reserve WHERE reserveId = ? ");
			ps.setString(1,reserveId);
			ps.executeUpdate();
			System.out.println("delete");
				
		}
	
	
	}
}
