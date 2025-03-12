package com.xworkz.movie.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/movie")
public class MovieServlet extends HttpServlet {

	public MovieServlet() {
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		
		PrintWriter writer = resp.getWriter();
		writer.print("<HTML>");
		writer.print("<TITLE>");
		writer.print("movie-booking");
		writer.print("</TITLE>");
		writer.print("</HTML>");
		
		String name = req.getParameter("name");
//		if(name!= null) {
//			writer.print("Name: ");
//			for(String n:name) {
//				writer.print(name+"<br>");
//			}
//		}
		
		
		String email = req.getParameter("email");
		String contact = req.getParameter("phone");
		String ticket_count = req.getParameter("ticket");
		int count = Integer.parseInt(ticket_count);
		
		String price = req.getParameter("price");
		int rate = Integer.parseInt(price);
		
		int totalPrice = count * rate;
		
		writer.print("Name: "+name+"<br>");
		writer.print("\nEmail: "+email+"<br>");
		writer.print("\nContact: "+contact+"<br>");
		writer.print("\nTicket Count: "+count+"<br>");
		writer.print("\nPrice: "+rate+"<br>");
		writer.print("\nTotal Price: "+totalPrice+"<br>");
		
	}
}
