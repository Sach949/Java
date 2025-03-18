package com.xworkz.gmail.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/register")
public class SignUpServlet extends HttpServlet {

	public SignUpServlet() {
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println(req.getParameter("fname"));
		System.out.println(req.getParameter("lname"));
		System.out.println(req.getParameter("email"));
		System.out.println(req.getParameter("mob"));
		System.out.println(req.getParameter("count"));
		
		String username = req.getParameter("email");
		req.setAttribute("username", username);
		RequestDispatcher rd = req.getRequestDispatcher("signed.jsp");
		rd.forward(req, resp);
		
	}
}
