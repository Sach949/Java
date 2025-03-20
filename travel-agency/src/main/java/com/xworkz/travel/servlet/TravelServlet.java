package com.xworkz.travel.servlet;

import java.io.IOException;


import com.xworkz.travel.dto.TravelDto;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/detail")
public class TravelServlet extends HttpServlet {

	public TravelServlet() {
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		int mob = Integer.parseInt(req.getParameter("mob"));
		String card = req.getParameter("card");
		String dest = req.getParameter("dest");
		String addr = req.getParameter("addr");
		String loc = req.getParameter("loc");
		String pack = req.getParameter("pack");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(mob);
		System.out.println(card);
		System.out.println(dest);
		System.out.println(addr);
		System.out.println(loc);
		System.out.println(pack);
		
		TravelDto dto = new TravelDto();
		dto.setName(name);
		dto.setEmail(email);
		dto.setMobile(mob);
		dto.setIdCard(card);
		dto.setDest(dest);
		dto.setAddr(addr);
		dto.setLoc(loc);
		dto.setPack(pack);
		
		System.out.println("Name is: "+name);
		System.out.println("Email is: "+email);
		System.out.println("Mobile no is: "+mob);
		System.out.println("Id card is: "+card);
		System.out.println("Destination is: "+dest);
		System.out.println("Address is: "+addr);
		System.out.println("Boarding Location is: "+loc);
		System.out.println("Package Type is: "+pack);
		
		req.setAttribute("dto", dto);
		RequestDispatcher rd= req.getRequestDispatcher("success.jsp");
		rd.forward(req, resp);
}
}
