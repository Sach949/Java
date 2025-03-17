package com.xworkz.hospital.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/test")
public class WelcomeServlet extends HttpServlet{

	public WelcomeServlet() {
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		
		System.out.println(fname);
		System.out.println(lname);
		
		RequestDispatcher rd = req.getRequestDispatcher("welcome.jsp");
		req.setAttribute("fname", fname);
		req.setAttribute("lname", lname);
		
		rd.forward(req, resp);
	}
	
}
