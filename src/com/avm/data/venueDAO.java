package com.avm.data;

import java.util.List;

import com.avm.model.venue;

public interface venueDAO {
	
	public List<venue> getVenue(String room) throws Exception;
	public void updateVenue(venue venues) throws Exception;

}
