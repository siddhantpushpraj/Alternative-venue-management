package com.avm.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.avm.model.venue;
import com.avm.data.connectionFactory;

public class venueDAOimpl implements venueDAO {

	@Override
	public List<venue> getVenue(String lectureHall) throws Exception {
		

		List<venue> venueList = new ArrayList<>() ;
		 Connection con=null;
		 PreparedStatement ps=null;
		 ResultSet rs=null;
		 try {
			 
			 con=connectionFactory.getCon();
		    	ps=con.prepareStatement("SELECT room FROM schedules WHERE "+lectureHall+"= 0");
		    	rs = ps.executeQuery();
		    	while(rs.next()) {
		    		
		    		String room = rs.getString("room");
		    		
		    		
		    		
		    	venue rooms = new venue(room);
		    	venueList.add(rooms);
		    				    		
		    	}
		    	
		        
		} finally {
			close(null,ps,con);
		}
		return venueList;
	}
	

	private void close(ResultSet rs, PreparedStatement ps, Connection con) {
		try {
			if(rs!=null) {
				rs.close();
			}
			if(ps!=null)
			{
				ps.close();
			}
			if(con!=null)
			{
				con.close();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}


	@Override
	public void updateVenue(venue venues) throws Exception {
		Connection con=null;
	    PreparedStatement ps=null;
	    
	    try {
	    	con=connectionFactory.getCon();
	    	ps=con.prepareStatement("update schedules set monday1 =?,\r\n" + 
	    			"monday2 =?,\r\n" + 
	    			"monday3 =?,\r\n" + 
	    			"monday4 =?,\r\n" + 
	    			"monday5 =?,\r\n" + 
	    			"monday6 =?,\r\n" + 
	    			"monday7 =?,\r\n" + 
	    			"monday8 =?,\r\n" + 
	    			"tuesday1 =?,\r\n" + 
	    			"tuesday2 =?,\r\n" + 
	    			"tuesday3 =?,\r\n" + 
	    			"tuesday4 =?,\r\n" + 
	    			"tuesday5 =?,\r\n" + 
	    			"tuesday6 =?,\r\n" + 
	    			"tuesday7 =?,\r\n" + 
	    			"tuesday8 =?,\r\n" + 
	    			"wednesday1 =?,\r\n" + 
	    			"wednesday2 =?,\r\n" + 
	    			"wednesday3 =?,\r\n" + 
	    			"wednesday4 =?,\r\n" + 
	    			"wednesday5 =?,\r\n" + 
	    			"wednesday6 =?,\r\n" + 
	    			"wednesday7 =?,\r\n" + 
	    			"wednesday8 =?,\r\n" + 
	    			"thursday1 =?,\r\n" + 
	    			"thursday2 =?,\r\n" + 
	    			"thursday3 =?,\r\n" + 
	    			"thursday4 =?,\r\n" + 
	    			"thursday5 =?,\r\n" + 
	    			"thursday6 =?,\r\n" + 
	    			"thursday7 =?,\r\n" + 
	    			"thursday8 =?,\r\n" + 
	    			"friday1 =?,\r\n" + 
	    			"friday2 =?,\r\n" + 
	    			"friday3 =?,\r\n" + 
	    			"friday4 =?,\r\n" + 
	    			"friday5 =?,\r\n" + 
	    			"friday6 =?,\r\n" + 
	    			"friday7 =?,\r\n" + 
	    			"friday8 =?,\r\n" + 
	    			"saturday1 =?,\r\n" + 
	    			"saturday2 =?,\r\n" + 
	    			"saturday3 =?,\r\n" + 
	    			"saturday4 =?,\r\n" + 
	    			"saturday5 =?,\r\n" + 
	    			"saturday6 =?,\r\n" + 
	    			"saturday7=?,saturday8 =? where room = ?");
	        
	        ps.setInt(1,venues.getMonday1());
	        ps.setInt(2,venues.getMonday2());
	        ps.setInt(3,venues.getMonday3());
	        ps.setInt(4,venues.getMonday4());
	        ps.setInt(5,venues.getMonday5());
	        ps.setInt(6,venues.getMonday6());
	        ps.setInt(7,venues.getMonday7());
	        ps.setInt(8,venues.getMonday8());
	        ps.setInt(9,venues.getTuesday1());
	        ps.setInt(10,venues.getTuesday2());
	        ps.setInt(11,venues.getTuesday3());
	        ps.setInt(12,venues.getTuesday4());
	        ps.setInt(13,venues.getTuesday5());
	        ps.setInt(14,venues.getTuesday6());
	        ps.setInt(15,venues.getTuesday7());
	        ps.setInt(16,venues.getTuesday8());
	        ps.setInt(17,venues.getWednesday1());
	        ps.setInt(18,venues.getWednesday2());
	        ps.setInt(19,venues.getWednesday3());
	        ps.setInt(20,venues.getWednesday4());
	        ps.setInt(21,venues.getWednesday5());
	        ps.setInt(22,venues.getWednesday6());
	        ps.setInt(23,venues.getWednesday7());
	        ps.setInt(24,venues.getWednesday8());
	        ps.setInt(25,venues.getThursday1());
	        ps.setInt(26,venues.getThursday2());
	        ps.setInt(27,venues.getThursday3());
	        ps.setInt(28,venues.getThursday4());
	        ps.setInt(29,venues.getThursday5());
	        ps.setInt(30,venues.getThursday6());
	        ps.setInt(31,venues.getThursday7());
	        ps.setInt(32,venues.getThursday8());
	        ps.setInt(33,venues.getFriday1());
	        ps.setInt(34,venues.getFriday2());
	        ps.setInt(35,venues.getFriday3());
	        ps.setInt(36,venues.getFriday4());
	        ps.setInt(37,venues.getFriday5());
	        ps.setInt(38,venues.getFriday6());
	        ps.setInt(39,venues.getFriday7());
	        ps.setInt(40,venues.getFriday8());
	        ps.setInt(41,venues.getSaturday1());
	        ps.setInt(42,venues.getSaturday2());
	        ps.setInt(43,venues.getSaturday3());
	        ps.setInt(44,venues.getSaturday4());
	        ps.setInt(45,venues.getSaturday5());
	        ps.setInt(46,venues.getSaturday6());
	        ps.setInt(47,venues.getSaturday7());
	        ps.setInt(48,venues.getSaturday8());
	        ps.setString(49,venues.getRoom());
	        
	        ps.executeUpdate();
	        
	    }
	    finally
	    {
	    	close(null,ps,con);
	    }
		
	}

}
