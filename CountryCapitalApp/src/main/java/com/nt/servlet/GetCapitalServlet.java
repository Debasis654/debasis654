package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetCapitalServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{

		//get printwriter stream obj from response obj
		PrintWriter pw=res.getWriter();

		//set response content type
		res.setContentType("text/html");
		//read form data(req parameter values)
		int country=Integer.parseInt(req.getParameter("country"));
		String capitals[]=new String[] {"New Delhi","Islamabad","WasingtonDC","Beijing"};
		String countries[]=new String[] {"India","Pakistan","USA","china"};
		//write b.logic(request processing logic)
        pw.println("<h1 style='color:red;text-align:center'>Capital name of country"+countries[country]+" is::"+capitals[country]+"</h1>");

    //add home hyperlink(graphical hyperlink)
		pw.println("<a href='page.html'>home</a>");
         
		pw.close();
	}//doGet(-,-)
	
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		doGet(req,res);
	}
}//class