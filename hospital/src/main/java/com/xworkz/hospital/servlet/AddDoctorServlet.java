package com.xworkz.hospital.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/patient")
public class AddDoctorServlet extends HttpServlet {

	
	public AddDoctorServlet()  {
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String spec = req.getParameter("spec");
		String addr = req.getParameter("addr");
		String qual = req.getParameter("qual");
		
		RequestDispatcher rd = req.getRequestDispatcher("doctorSuccess.jsp");
		req.setAttribute("name", name);
		req.setAttribute("spec", spec);
		req.setAttribute("addr", addr);
		req.setAttribute("qual", qual);
		
		rd.forward(req, resp);
	}
}
