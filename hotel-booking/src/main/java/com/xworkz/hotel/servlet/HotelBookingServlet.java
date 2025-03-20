package com.xworkz.hotel.servlet;

import java.io.IOException;
import java.net.Authenticator.RequestorType;

import com.xworkz.hotel.dto.HotelBookingDto;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/detail")
public class HotelBookingServlet  extends HttpServlet{

	public HotelBookingServlet() {
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		int mob = Integer.parseInt(req.getParameter("mob"));
		String card = req.getParameter("card");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(mob);
		System.out.println(card);
		
		HotelBookingDto dto = new HotelBookingDto();
		dto.setName(name);
		dto.setEmail(email);
		dto.setMobile(mob);
		dto.setIdCard(card);
		
		System.out.println("Name is: "+name);
		System.out.println("Email is: "+email);
		System.out.println("Mobile no is: "+mob);
		System.out.println("Id card is: "+card);
		
		req.setAttribute("dto", dto);
		RequestDispatcher rd= req.getRequestDispatcher("success.jsp");
		rd.forward(req, resp);
		
		
		
		
	}
	
}
