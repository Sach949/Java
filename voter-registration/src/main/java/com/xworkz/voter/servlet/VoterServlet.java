package com.xworkz.voter.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/reg")
public class VoterServlet extends HttpServlet{

	public VoterServlet() {
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.print("<HTML>");
		writer.print("<TITLE>");
		writer.print("voter-reg");
		writer.print("</TITLE>");
		writer.print("</HTML>");
		
		String name = req.getParameter("name");
		
		String father = req.getParameter("father");
		
		String email = req.getParameter("email");
		
		String contact = req.getParameter("phone");
		
		String dob = req.getParameter("dob");
		
		String addr = req.getParameter("addr");
		
		String constName = req.getParameter("const");
		
		String pincode = req.getParameter("pin");
		int pin = Integer.parseInt(pincode);
		
		writer.print("Name: "+name+"<br>");
		writer.print("Father Name: "+father+"<br>");
		writer.print("\nEmail: "+email+"<br>");
		writer.print("\nContact: "+contact+"<br>");
		writer.print("\nDate of Birth: "+dob+"<br>");
		writer.print("\nAddress: "+addr+"<br>");
		writer.print("\nConstituency name: "+constName+"<br>");
		writer.print("\nPincode: "+pin+"<br>"); 
	}
}
