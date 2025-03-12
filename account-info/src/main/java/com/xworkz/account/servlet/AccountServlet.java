package com.xworkz.account.servlet;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/view")
public class AccountServlet implements Servlet{

	public AccountServlet() {
		System.out.println("Default");
	}
	
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("Service method");
		System.out.println(request.getParameter("user"));
		System.out.println(request.getParameter("pass"));
		System.out.println(request.getParameter("email"));
		System.out.println(request.getParameter("mob"));
		System.out.println(request.getParameter("create"));
		
	}

	
}
