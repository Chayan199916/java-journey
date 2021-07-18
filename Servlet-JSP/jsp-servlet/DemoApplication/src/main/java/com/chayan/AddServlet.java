package com.chayan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet
{
	/*
	 *	service method calls doGet by default if not mentioned.
	 *	getWriter returns object of PrintWriter
	 */
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
		
		PrintWriter out = res.getWriter();
//		out.println(first + second);
		
		/*
		 * Using ServletContext
		 * */
//		ServletContext context = getServletContext();
//		String name = context.getInitParameter("name");
		
		/*
		 * Using ServletConfig
		 * */
//		ServletConfig cfg = getServletConfig();
//		String name = cfg.getInitParameter("name");
//		
//		out.println(name);

		/*
		 * sending data from one servlet to other servlet using req object
		 * */
		
//		req.setAttribute("result", result);
		
		/*
		 * dispatching another servlet which has been mapped to /sq url pattern from this servlet
		 * */
//		RequestDispatcher requestDispatcher = req.getRequestDispatcher("sq");
//		requestDispatcher.forward(req, res);
		
		/*
		 * another way of sending req from one servlet to another one. url rewriting being used to send data 
		 */
//		res.sendRedirect("sq?result=" + result); // URL rewriting
		
		/*session management*/
//		HttpSession session = req.getSession();		
//		session.setAttribute("result", result);
		
		/*Cookie management
		 * this cookie will be sent to client with response
		 * and then when client will send req to url "/sq", inside 
		 * the servlet we will accept cookie and the data stored in it.
		 * */
//		Cookie cookie = new Cookie("result", result + "");
//		res.addCookie(cookie);
		
		
		
//		res.sendRedirect("sq");
		
	}
}
