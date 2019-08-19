package com.avm.data;


import java.sql.Connection;
import java.sql.DriverManager;

public class connectionFactory {
	
	public static Connection getCon() throws Exception{
		Connection con = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3307/venue_management","root","root");
		return con;
	}

}
