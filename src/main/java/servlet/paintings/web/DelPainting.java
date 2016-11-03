package servlet.paintings.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.paintings.domain.Artist;
import servlet.paintings.domain.Location;
import servlet.paintings.domain.Painting;
import servlet.paintings.service.StorageService;


@WebServlet(urlPatterns = "delPainting")
public class DelPainting extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		
		PrintWriter print = response.getWriter();
		
		StorageService sts = (StorageService)request.getAttribute("storage");
		
		
		//???
		
		String name = request.getParameter("name");
		int yoc = Integer.parseInt(request.getParameter("yoc"));
		String artist = request.getParameter("artist");
		String location = request.getParameter("location");
		
		sts.deletePainting(new Painting(name, yoc, artist, location));
		
		print.println("<html><head><title>Add Painting</title></head> <body>"
				+ "<p>Following painting has been deleted from storage: </p>"
				+ "<p>Name: " + name + "</p>"
				+ "<p>Year of creation: " + yoc + "</p>"
				+ "<p>Artist: " + artist + "</p>"
				+ "<p>Location: " + location + "</p>"
				+ "<p><a href='showAll'>Show All</p>"
				+ "</body></html>");
		
	}
	
}