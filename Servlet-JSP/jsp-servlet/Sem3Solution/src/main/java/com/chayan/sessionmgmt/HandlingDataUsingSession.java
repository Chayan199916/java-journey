package com.chayan.sessionmgmt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HandlingDataUsingSession
 */
@WebServlet("/send")
public class HandlingDataUsingSession extends HttpServlet {
	/*
	 * This is a demonstration of using session object to store data-------
	 * 
	 * So we will send name and address via url parameter (/send?name="chayan"&address="sodepur") using get request and will accept in 
	 * doGet method. Then we will save those data in session so that we can reuse it in future.
	 * */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*getting data from request object and putting into session object*/
		
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		
		/*session management*/
		HttpSession session = request.getSession();		
		session.setAttribute("name", name);
		session.setAttribute("address", address);
		
		/*taking data from session*/
		name = (String)session.getAttribute("name");
		address = (String)session.getAttribute("address");
		
		/*sending response*/
		PrintWriter out = response.getWriter();
		out.println(name);
		out.println(address);
	}

}
