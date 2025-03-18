package com.xworkz.whatsapp.servlet;

import java.io.IOException;
import java.util.Random;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/create")
public class OtpServlet extends HttpServlet {

	public OtpServlet() {
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String mob = req.getParameter("mob");
		
		int otp = new Random().nextInt(900000)+100000;
		
		//HttpSession session = req.getSession();
		req.setAttribute("otp", otp);
		req.setAttribute("mob", mob);
		
		RequestDispatcher rd = req.getRequestDispatcher("otp.jsp");
		rd.forward(req, resp);
	}
}
