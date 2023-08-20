package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");//MIME Type
	PrintWriter pw=	res.getWriter();
	pw.print("<h2> Welcome  to servlets....");
		
	}

}
