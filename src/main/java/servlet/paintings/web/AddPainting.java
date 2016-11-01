package servlet.paintings.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.paintings.domain.Painting;
import servlet.paintings.service.StorageService;

@WebServlet(urlPatterns = "/addPainting")
public class AddPainting extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		PrintWriter print = response.getWriter();
		
		
		
		print.println("<html><head><title>Add Painting</title></head> <body>"
				+ "<p>Following person has been added to storage: </p>"
				+ "<p>Name: " + request.getParameter("name") + "</p>"
				+ "<p>Year of creation: " + request.getParameter("yoc") + "</p>"
				+ "<p>Artist: " + request.getParameter("artist") + "</p>"
				+ "<p>Location: " + request.getParameter("location") + "</p>"
				+ "<p><a href='showAll'>Show All</p>"
				+ "</body></html>");
		print.close();
		
	}
	
	
}
