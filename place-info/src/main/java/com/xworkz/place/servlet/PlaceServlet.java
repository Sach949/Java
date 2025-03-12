package com.xworkz.place.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/place")
public class PlaceServlet extends HttpServlet{

	public PlaceServlet() {
		System.out.println("Default");
	}

	public void doGet(HttpServletRequest req, HttpServletResponse rep) throws IOException {
		System.out.println("Do get method");
		rep.setContentType("text/html");
		PrintWriter writer = rep.getWriter();
		writer.print("Do get method Processed succesfully");
		writer.close();
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse rep) throws IOException {
		System.out.println("Do post method");
		rep.setContentType("text/html");
		PrintWriter writer = rep.getWriter();
		writer.print("Do post method Processed succesfully");
		writer.close();
	}

	public void doPut(HttpServletRequest req, HttpServletResponse rep) throws IOException {
		System.out.println("Do put method");
		rep.setContentType("text/html");
		PrintWriter writer = rep.getWriter();
		writer.print("Do put method Processed succesfully");
		writer.close();
	}

	public void doDelete(HttpServletRequest req, HttpServletResponse rep) throws IOException {
		System.out.println("Do delete method");
		rep.setContentType("text/html");
		PrintWriter writer = rep.getWriter();
		writer.print("Do delete method Processed succesfully");
		writer.close();
	}

	public void doTrace(HttpServletRequest req, HttpServletResponse rep) throws IOException {
		System.out.println("Do trace method");
		rep.setContentType("text/html");
		PrintWriter writer = rep.getWriter();
		writer.print("Do trace method Processed succesfully");
		writer.close();
	}

	public void doOption(HttpServletRequest req, HttpServletResponse rep) throws IOException {
		System.out.println("Do option method");
		rep.setContentType("text/html");
		PrintWriter writer = rep.getWriter();
		writer.print("Do option method Processed succesfully");
		writer.close();
	}

	do

	
	

}
