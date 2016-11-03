package servlet.paintings.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/getPainting")
public class GetPainting extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		
		PrintWriter print = response.getWriter();
		
		print.println("<html> <head><title>Get Painting</title></head> <body>"
					+ "<form action = 'addPainting'>"
				+ "Painting name: <input type = 'text' name='name'/></br>"
				+ "Year of creation: <input type = 'text' name='yoc'/></br>"
				+ "Artist: <input type = 'text' name='artist'/></br>"
				+ "Location: <input type = 'text' name='location'/></br>"
				+ "<input type='submit' value=' OK ' /></form>"
					+ "<form action = 'updPainting'>"
				+ "Painting name: <input type = 'text' name='name'/></br>"
				+ "Year of creation: <input type = 'text' name='yoc'/></br>"
				+ "Artist: <input type = 'text' name='artist'/></br>"
				+ "Location: <input type = 'text' name='location'/></br>"
				+ "<input type='submit' value=' OK ' /></form>"
					+ "<form action = 'delPainting'>"
				+ "Painting name: <input type = 'text' name='name'/></br>"
				+ "Year of creation: <input type = 'text' name='yoc'/></br>"
				+ "Artist: <input type = 'text' name='artist'/></br>"
				+ "Location: <input type = 'text' name='location'/></br>"
				+ "<input type='submit' value=' OK ' /></form>"
				+ "</body></html>");
		print.close();
		
		
	}
	
}
