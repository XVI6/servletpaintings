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

@WebServlet(urlPatterns = "/addPainting")
public class AddPainting extends HttpServlet{
	
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
		
		Painting p = new Painting(name, yoc, artist, location);
		
		request.setAttribute("storage", p);
		sts.addPainting(p);
		
		
		//sts.addPainting(new Painting(name, yoc, artist, location));
		
		print.println("<html><head><title>Add Painting</title></head> <body>"
				+ "<p>Following painting has been added to storage: </p>"
				+ "<p>Name: " + name + "</p>"
				+ "<p>Year of creation: " + yoc + "</p>"
				+ "<p>Artist: " + artist + "</p>"
				+ "<p>Location: " + location + "</p>"
				+ "<p><a href='showAll.jsp'>Show All</p>"
				+ "</body></html>");
		print.close();
		
	}
	
	
}
