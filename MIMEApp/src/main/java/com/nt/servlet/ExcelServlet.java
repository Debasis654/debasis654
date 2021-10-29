//ExcelServlet.java
package com.nt.servlet;

import javax.servlet.*;//servlet api
import javax.servlet.http.*;//iostreams api
import java.io.*;//utility api

	public class ExcelServlet extends HttpServlet
	{
	protected void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
    
	  //set response content type
	  res.setContentType("application/vnd.ms-excel");

	  //get printwriter stream obj from response obj
	     PrintWriter pw=res.getWriter();
		
        //write genereted output to response obj using Printwriter Stream
		  pw.println("<table border='1' align='center'>");
          pw.println("<tr><th>player name</th> <th>Medal</th> <th>Catagory</th></tr>");
		  pw.println("<tr><td>Neeraj Chopra</td> <td>Gold</td> <td>Javelin throw</td></tr>");
          pw.println("<tr><td>Meera bai chanu</td> <td>silver</td> <td>weight lifting</td></tr>");
		  pw.println("<tr><td>Ravi kumar dahiya</td> <td>silver</td> <td>wrestling</td></tr>");
		  pw.println("<tr><td>PV Sindhu</td> <td>bronze</td> <td>Badminton</td></tr>");
		  pw.println("<tr><td>Lovlina</td> <td>bronze</td> <td>boxing</td></tr>");
          pw.println("</table>");
		  //close the steam
		  pw.close();
	}//services(-,-)
}//clas
