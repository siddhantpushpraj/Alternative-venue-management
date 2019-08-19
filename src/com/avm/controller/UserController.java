package com.avm.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.avm.data.UserDAOImpl;
import com.avm.model.User;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")



public class UserController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	UserDAOImpl userUtil =  null;
	
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		userUtil = new UserDAOImpl();
	}
	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String command = request.getParameter("command");
			switch (command) {
			
			case "USER":
				getUser(request,response);
				break;

			default:
				break;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	private void getUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		
		String resource = "user-sign-in.jsp";
		String message = null;
		
		try {
			User user = userUtil.getUser(userId);
			if(user.getPassword().equals(password)) {
				System.out.println("error");
				resource = "venueController";
				
				
			}
			else {
				message = "Wrong password  : try again";
			}
		} catch (Exception e) {
			// TODO: handle exception
			message=e.getMessage();
			System.out.println(e);
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(resource);
		request.setAttribute("msg", message);
		rd.forward(request, response);
		
		
	}
	

}
