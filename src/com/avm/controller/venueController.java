package com.avm.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.avm.data.venueDAOimpl;
import com.avm.model.venue;


/**
 * Servlet implementation class venueController
 */
@WebServlet("/venueController")
public class venueController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	venueDAOimpl venueUtil = null;
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		venueUtil = new venueDAOimpl();
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			 String COMMAND=request.getParameter("COMMAND");
			 
				if(COMMAND==null)
				{
					COMMAND="go";
				}
				switch(COMMAND) {
				
				case "show":
					showFree(request,response);
					break;
				case "go":
					go(request,response);
				case "update":
					update(request,response);
						
				default:
					showFree(request, response);
						
				
				}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String resource = "admin-option.jsp";
		String message = null;
		
		String room = request.getParameter("room");
		
		int monday1 = checkValue(request.getParameter("monday1"));

		int monday2 = checkValue(request.getParameter("monday2"));
		
		int monday3 = checkValue(request.getParameter("monday1"));
		int monday4 = checkValue(request.getParameter("monday4"));
		int monday5 = checkValue(request.getParameter("monday5"));
		int monday6 = checkValue(request.getParameter("monday6"));
		int monday7 = checkValue(request.getParameter("monday7"));
		int monday8 = checkValue(request.getParameter("monday8"));
		int tuesday1 = checkValue(request.getParameter("tuesday1"));
		int tuesday2 = checkValue(request.getParameter("tuesday2"));
		int tuesday3 = checkValue(request.getParameter("tuesday3"));
		int tuesday4 = checkValue(request.getParameter("tuesday4"));
		int tuesday5 = checkValue(request.getParameter("tuesday5"));
		int tuesday6 = checkValue(request.getParameter("tuesday6"));
		int tuesday7 = checkValue(request.getParameter("tuesday7"));
		int tuesday8 = checkValue(request.getParameter("tuesday8"));
		int wednesday1 = checkValue(request.getParameter("wednesday1"));
		int wednesday2 = checkValue(request.getParameter("wednesday2"));
		int wednesday3 = checkValue(request.getParameter("wednesday3"));
		int wednesday4 = checkValue(request.getParameter("wednesday4"));
		int wednesday5 = checkValue(request.getParameter("wednesday5"));
		int wednesday6 = checkValue(request.getParameter("wednesday6"));
		int wednesday7 = checkValue(request.getParameter("wednesday7"));
		int wednesday8 = checkValue(request.getParameter("wednesday8"));
		int thursday1 = checkValue(request.getParameter("thursday1"));
		int thursday2 = checkValue(request.getParameter("thursday2"));
		int thursday3 = checkValue(request.getParameter("thursday3"));
		int thursday4 = checkValue(request.getParameter("thursday4"));
		int thursday5 = checkValue(request.getParameter("thursday5"));
		int thursday6 = checkValue(request.getParameter("thursday6"));
		int thursday7 = checkValue(request.getParameter("thursday7"));
		int thursday8 = checkValue(request.getParameter("thursday8"));
		int friday1 = checkValue(request.getParameter("friday1"));
		int friday2 = checkValue(request.getParameter("friday2"));
		int friday3 = checkValue(request.getParameter("friday3"));
		int friday4 = checkValue(request.getParameter("friday4"));
		int friday5 = checkValue(request.getParameter("friday5"));
		int friday6 = checkValue(request.getParameter("friday6"));
		int friday7 = checkValue(request.getParameter("friday7"));
		int friday8 = checkValue(request.getParameter("friday8"));
		int saturday1 = checkValue(request.getParameter("saturday1"));
		int saturday2 = checkValue(request.getParameter("saturday2"));
		int saturday3 = checkValue(request.getParameter("saturday3"));
		int saturday4 = checkValue(request.getParameter("saturday4"));
		int saturday5 = checkValue(request.getParameter("saturday5"));
		int saturday6 = checkValue(request.getParameter("saturday6"));
		int saturday7 = checkValue(request.getParameter("saturday7"));
		int saturday8 = checkValue(request.getParameter("saturday8"));

		try {
			
			venue venues = new venue(room, monday1, monday2, monday3, monday4, monday5, monday6, monday7, monday8, tuesday1, tuesday2, tuesday3, tuesday4, tuesday5, tuesday6, tuesday7, tuesday8, wednesday1, wednesday2, wednesday3, wednesday4, wednesday5, wednesday6, wednesday7, wednesday8, thursday1, thursday2, thursday3, thursday4, thursday5, thursday6, thursday7, thursday8, friday1, friday2, friday3, friday4, friday5, friday6, friday7, friday8, saturday1, saturday2, saturday3, saturday4, saturday5, saturday6, saturday7, saturday8) ;
			
			venueUtil.updateVenue(venues);
			message = "Venue updated";
			
			
		} catch (Exception e) {
			message = e.getMessage();
			System.out.println(e);
		}
		RequestDispatcher rd = request.getRequestDispatcher("admin-option.jsp");
		request.setAttribute("msg", message);
		rd.forward(request, response);
		
		
	}

	private void go(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		RequestDispatcher rd=request.getRequestDispatcher("user-page.jsp");
		rd.forward(request, response);
		
	}

	private void showFree(HttpServletRequest request, HttpServletResponse response) throws Exception {
	 
		try {
			
			String day  = request.getParameter("day");
			if(day.equals( "Select Weekday")) {
				RequestDispatcher rd=request.getRequestDispatcher("user-page.jsp");
				rd.forward(request, response);
			}
			else {
				String lecture = request.getParameter("lecture");
				String dayLecture = day + lecture;
				List<venue> freeLecture = venueUtil.getVenue(dayLecture);
				System.out.println(freeLecture);
				request.setAttribute("ROOMS", freeLecture);
				RequestDispatcher rd=request.getRequestDispatcher("user-page.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd=request.getRequestDispatcher("user-page.jsp");
		rd.forward(request, response);
		doPost(request, response);
	}

	public int checkValue(String val) {
		
		if(val!=null) {
			return 1;
		}
		else {
			return 0;
		}
	}

	
	
}
