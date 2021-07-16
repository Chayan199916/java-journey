package com.chayan;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
//	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		int first = Integer.parseInt(req.getParameter("num1"));
//		int second = Integer.parseInt(req.getParameter("num2"));
//		PrintWriter out = res.getWriter();
//		out.println(first + second);
//	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int first = Integer.parseInt(req.getParameter("num1"));
		int second = Integer.parseInt(req.getParameter("num2"));
		int result = first + second;
//		PrintWriter out = res.getWriter();
//		out.println(first + second);
		
//		req.setAttribute("result", result);
//		RequestDispatcher requestDispatcher = req.getRequestDispatcher("sq");
//		requestDispatcher.forward(req, res);
		
		res.sendRedirect("sq?result=" + result); // URL rewriting
	}
}
