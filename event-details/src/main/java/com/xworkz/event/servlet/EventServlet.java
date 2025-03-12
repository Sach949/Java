package com.xworkz.event.servlet;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/detail")
public class EventServlet implements Servlet{

	public EventServlet() {
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
		System.out.println(request.getParameter("id"));
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("date"));
		System.out.println(request.getParameter("place"));
		System.out.println(request.getParameter("org"));
		
	}

	
}
