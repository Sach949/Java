package com.xworkz.order.servlet;

import java.io.IOException;

import com.xworkz.order.dto.OrderDto;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/order")
public class OrderServlet extends HttpServlet {

	public OrderServlet() {
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		int mob = Integer.parseInt(req.getParameter("mob"));
		String prod = req.getParameter("prod");
		int qty = Integer.parseInt(req.getParameter("qty"));
		int price = Integer.parseInt(req.getParameter("price"));
		String addr = req.getParameter("addr");
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(mob);
		System.out.println(prod);
		System.out.println(qty);
		System.out.println(price);
		System.out.println(addr);
		
		OrderDto dto = new OrderDto();
		dto.setId(id);
		dto.setName(name);
		dto.setEmail(email);
		dto.setMobile(mob);
		dto.setProdName(prod);
		dto.setQty(qty);
		dto.setPrice(price);
		dto.setAddr(addr);
		

		System.out.println("ID is: "+id);
		System.out.println("Name is: "+name);
		System.out.println("Email is: "+email);
		System.out.println("Mobile no is: "+mob);
		System.out.println("Product Name is: "+prod);
		System.out.println("Quantity is: "+qty);
		System.out.println("Price is: "+price);
		System.out.println("Address is: "+addr);
		
		req.setAttribute("dto", dto);
		RequestDispatcher rd= req.getRequestDispatcher("success.jsp");
		rd.forward(req, resp);
}
}
