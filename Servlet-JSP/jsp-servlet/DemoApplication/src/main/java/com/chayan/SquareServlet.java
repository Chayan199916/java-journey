package com.chayan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends  HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int k = Integer.parseInt(req.getParameter("result"));
		PrintWriter out = res.getWriter();
		out.println(k * k);
	}
}
