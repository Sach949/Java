package com.xworkz.whatsapp.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/otp")
public class CreateAccServlet extends HttpServlet {

	public CreateAccServlet() {
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		int generatedOtp = (int) session.getAttribute("otp");
		String mob = (String) session.getAttribute("mob");
		int otpEntered = Integer.parseInt(req.getParameter("otp"));
		if(otpEntered==generatedOtp) {
			session.setAttribute("isAuthenticated", true);
			resp.sendRedirect("success.jsp");
		}else {
			System.out.println("Invalid");
		}
	}
	
}
