package com.avm.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.avm.model.admin;

public class adminDAOImpl implements adminDAO{
	
	@Override
	public void addUser(admin admins) throws Exception {
		
		Connection con = null;
		PreparedStatement ps = null;
		try {
			
			con = connectionFactory.getCon();
			ps = con.prepareStatement("insert admins values(?,?,?)");
			ps.setString(1, admins.getAdminId());
			ps.setString(2, admins.getPassword());
			ps.setString(3, admins.getName());
			
					
			ps.executeUpdate();
			
		}
		finally {
			close(null, ps, con);
		}
		
	}

	@Override
	public admin getUser(String userId) throws Exception {
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		admin admins = null;
		
		try {
			con = connectionFactory.getCon();
			ps = con.prepareStatement("select * from admins where admin_id = ?");
			ps.setString(1, userId);
			rs = ps.executeQuery();
			if(rs.next()) {
				admins = new admin();
				admins.setAdminId(rs.getString("admin_id"));
				admins.setPassword(rs.getString("password"));
				admins.setName(rs.getString("name"));
				
				
			}
			else {
				throw new Exception("Invalid user id");
			}
		}
		finally {
			close(rs, ps, con);
		}
		
		return admins;
	}
	
	private void close(ResultSet rs, PreparedStatement ps, Connection con) {
		try {
			if(rs != null) {
				rs.close();
			}
			if( ps != null) {
				ps.close();
			}
			if(con != null) {
				con.close();
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}


}
