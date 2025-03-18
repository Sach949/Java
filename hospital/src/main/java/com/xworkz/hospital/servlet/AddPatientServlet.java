package com.xworkz.hospital.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/patient")
public class AddPatientServlet extends HttpServlet{

	public AddPatientServlet() {
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String dis = req.getParameter("dis");
		String addr = req.getParameter("addr");
		String guard = req.getParameter("guard");
		
		RequestDispatcher rd = req.getRequestDispatcher("patientSuccess.jsp");
		req.setAttribute("name", name);
		req.setAttribute("dis", dis);
		req.setAttribute("addr", addr);
		req.setAttribute("guard", guard);
		
		rd.forward(req, resp);
	}
	
}
