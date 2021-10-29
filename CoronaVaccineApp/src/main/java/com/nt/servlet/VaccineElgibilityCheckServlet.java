package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VaccineElgibilityCheckServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{

		//get printwriter stream obj from response obj
		PrintWriter pw=res.getWriter();

		//set response content type
		res.setContentType("text/html");
		//read form data(req parameter values)
		String name=req.getParameter("pname");
		int age=Integer.parseInt(req.getParameter("page"));
		String address=req.getParameter("paddrs");
		//write b.logic(request processing logic)
		if(age<18)
			pw.println("<h1 style='color:red;text-align:center'>Mr/Mrs."+name+" U r not eligible for corona vaccine</h1>");
		else
			pw.println("<h1 style='color:green;text-align:center'>Mr/Mrs."+name+" U r eligible for corona vaccine</h1>");

      //add home hyperlink(graphical hyperlink)
		pw.println("<a href='http://localhost:3030/CoronaVaccineApp/corona_vaccine.html'><img src='images/home1.png'></a>");
         
		pw.close();
	}//doGet(-,-)
	
}//class