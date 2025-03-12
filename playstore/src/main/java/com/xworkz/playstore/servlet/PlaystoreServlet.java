package com.xworkz.playstore.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/store")
public class PlaystoreServlet implements Servlet {

	public PlaystoreServlet() {
		System.out.println("Contructor");
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
		System.out.println(request.getParameter("own"));
		System.out.println(request.getParameter("apps"));
		System.out.println(request.getParameter("platform"));
		System.out.println(request.getParameter("version"));
		System.out.println(request.getParameter("patch"));
		
		
		//response sent back by server
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.print("Playstore details shown successfully");
		writer.print("<HTML>");
		writer.print("<TITLE>");
		writer.print("playstore -app");
		writer.print("</TITLE>");
		writer.print("</HTML>");
		writer.close();
	}

}
