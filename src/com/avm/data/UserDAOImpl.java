package com.avm.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.avm.model.User;

public class UserDAOImpl implements UserDAO {

	@Override
	public void addUser(User user) throws Exception {
		
		Connection con = null;
		PreparedStatement ps = null;
		try {
			
			con = connectionFactory.getCon();
			ps = con.prepareStatement("insert users values(?,?,?)");
			ps.setString(1, user.getUserId());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getName());
			
					
			ps.executeUpdate();
			
		}
		finally {
			close(null, ps, con);
		}
		
	}

	@Override
	public User getUser(String userId) throws Exception {
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		User user = null;
		
		try {
			con = connectionFactory.getCon();
			ps = con.prepareStatement("select * from users where user_id = ?");
			ps.setString(1, userId);
			rs = ps.executeQuery();
			if(rs.next()) {
				user = new User();
				user.setUserId(rs.getString("user_id"));
				user.setPassword(rs.getString("password"));
				user.setName(rs.getString("name"));
				
				
			}
			else {
				throw new Exception("Invalid user id");
			}
		}
		finally {
			close(rs, ps, con);
		}
		
		return user;
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
