package com.xworkz.ccd.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/order")
public class CcdServlet extends HttpServlet{

	public CcdServlet() {
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("placed.jsp");
		
		String item = req.getParameter("item");
		double qty = Double.parseDouble(req.getParameter("qty"));
		double price = Double.parseDouble(req.getParameter("price"));
		
		double totalPrice = qty*price;
		
		double discountedPrice =  getDiscount(totalPrice);
		
		double gst = totalPrice*18/100;
		
		double finalPrice = discountedPrice +gst;
		
		req.setAttribute("itemName", item);
		req.setAttribute("totalPrice", totalPrice);
		req.setAttribute("dicopunt", discountedPrice);
		req.setAttribute("finalPrice", finalPrice);
		req.setAttribute("qunty", qty);
		req.setAttribute("prices", price);
		
		
		rd.forward(req, resp);
		
//		System.out.println(req.getParameter("item"));
//		System.out.println(req.getParameter("qty"));
//		System.out.println(req.getParameter("price"));
		
		
		
		
	}
	
	public double getDiscount(double amount) {
		if(amount <= 300) {
			return amount;
		}
		else if(amount >300 && amount <=500) {
			return amount-(amount*5)/100;
		}
		else if(amount > 500 && amount <=1000) {
			return amount-(amount*15)/100;
		}
		else if(amount >1000) {
			return amount-(amount*10)/100;
		}
		
		return 0;
	}
}
