package com.xworkz.billing.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/billing")
public class BillingServlet extends HttpServlet{

	public BillingServlet() {
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.print("<HTML>");
		writer.print("<TITLE>");
		writer.print("billing-app");
		writer.print("</TITLE>");
		writer.print("</HTML>");
		
		String item = req.getParameter("item");
		String quantity = req.getParameter("qty");
		String price = req.getParameter("price");
		
		int qty = Integer.parseInt(quantity);
		int rate = Integer.parseInt(price);
		
		int totalPrice = qty* rate;
		
		writer.print("Name of the item: "+item+"<br>");
		writer.print("\nQuantity is: "+qty+"<br>");
		writer.print("\nPrice is: "+rate+"<br>");
		writer.print("\nTotal price is: "+totalPrice+"<br>");
		
	}
}
