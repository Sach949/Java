package com.xworkz.gst.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/gst")
public class GstClaculator extends HttpServlet{

	public GstClaculator() {
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.print("<HTML>");
		writer.print("<TITLE>");
		writer.print("GST");
		writer.print("</TITLE>");
		writer.print("</HTML>");
		
		String amount = req.getParameter("amt");
		
		int tax = (Integer.parseInt(amount) * 18) /100 ;
		
		writer.print("Total amount :"+amount+"<br>");
		writer.print("\nTotal tax :"+tax+"<br>");
		int total = tax +Integer.parseInt(amount);
		
		writer.print("\nTotal amount with GST :"+total+"<br>");
		
	}
}
