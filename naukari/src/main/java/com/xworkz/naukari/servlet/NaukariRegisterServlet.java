package com.xworkz.naukari.servlet;


import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/register")
public class NaukariRegisterServlet extends HttpServlet {

	public NaukariRegisterServlet() {
		
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("regSuccess.jsp");
		System.out.println(req.getParameter("fname"));
		System.out.println(req.getParameter("lname"));
		System.out.println(req.getParameter("email"));
		System.out.println(req.getParameter("mob"));
		System.out.println(req.getParameter("count"));
		
		String username = req.getParameter("email");
		req.setAttribute("username", username);
		
		rd.forward(req, resp);
	}
}
