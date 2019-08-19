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
import com.avm.data.adminDAOImpl;

import com.avm.model.admin;
import com.avm.model.User;


/**
 * Servlet implementation class UserController
 */
@WebServlet("/adminController")



public class adminController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	adminDAOImpl adminUtil = null;
	UserDAOImpl userUtil = null;
	
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		adminUtil = new adminDAOImpl();
		userUtil = new UserDAOImpl();
	}
	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String command = request.getParameter("command");
			switch (command) {
			case "ADD":
				additem(request,response);
				break;
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
		
		String resource = "admin-sign-in.jsp";
		String message = null;
		
		try {
			admin user = adminUtil.getUser(userId);
			if(user.getPassword().equals(password)) {
				
				resource = "admin-option.jsp";
				
				
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


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

	private void additem(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String passsword = request.getParameter("password");
		String Name = request.getParameter("Name");
		
		
		String resource = "registration.jsp";
		String message = null;
		
		User user = new User(userId, passsword,Name);
		
		try {
			userUtil.addUser(user);
			message = "Registration SuccessFully : please Login";
			resource = "indexPage.jsp";
		} catch (Exception e) {
			message = e.getMessage();
			System.out.println(e);
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(resource);
		request.setAttribute("msg", message);
		rd.forward(request, response);
		
		
		
	}

	


	
	

}
