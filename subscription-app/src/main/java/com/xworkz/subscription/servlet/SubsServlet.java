package com.xworkz.subscription.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/subscribe")
public class SubsServlet extends HttpServlet{

	public SubsServlet() {
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		String name = req.getParameter("name");
		PrintWriter writer = resp.getWriter();
		
		writer.print("<HTML>");
		writer.print("<TITLE>");
		writer.print("subscription");
		writer.print("</TITLE>");
		writer.print("</HTML>");
		
		writer.print("Thank you for subscription "+name+" !!");
	}
}
