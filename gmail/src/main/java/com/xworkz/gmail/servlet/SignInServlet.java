package com.xworkz.gmail.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login")
public class SignInServlet extends HttpServlet{

	public SignInServlet() {
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
		
		System.out.println(req.getParameter("user"));
		System.out.println(req.getParameter("pass"));
		
		rd.forward(req, resp);
	}
}
