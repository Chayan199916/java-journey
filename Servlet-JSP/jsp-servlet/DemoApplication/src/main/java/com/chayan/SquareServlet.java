package com.chayan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq")
public class SquareServlet extends  HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		HttpSession session = req.getSession();
		/*
		 * to remove value from session : session.removeAttribute();
		 * */
		/*taking data from session*/
//		int k = (int) session.getAttribute("result");
		
		
//		int k = Integer.parseInt(req.getParameter("result"));
		
		/*taking data from cookie*/
//		Cookie cookies[] = req.getCookies();
		/*
		 * So now we have all the cookies, we have to 
		 * check the cookie name to get the cookie we want
		 * */
//		int k = 0;
//		for(Cookie cookie : cookies) {
//			if(cookie.getName().equals("result")) {
//				k = Integer.parseInt(cookie.getValue());
//			}
//		}
//		
//		PrintWriter out = res.getWriter();
//		out.println(k * k);
		
		
		
		
	}
}
