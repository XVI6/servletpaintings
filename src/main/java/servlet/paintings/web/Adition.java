package servlet.paintings.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/aditionform")
public class Adition extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		
		PrintWriter print = response.getWriter();
		print.println("<html><body><h2>Choose 'The Starry Night' autor </h2>" +
				"<form action='aditionanswer'>" +
				"First name: <input type='text' name='firstName' /> <br />" +
				"<input type='checkbox' name='artist' value='artist1'>Pablo Ruiz y Picasso( Pablo Picasso )<br />" +
				"<input type='checkbox' name='artist' value='artist2'>Michelangelo di Lodovico Buonarroti Simoni<br />" +
				"<input type='checkbox' name='artist' value='artist3'>Vincent Willem van Gogh<br />" +
				"<input type='checkbox' name='artist' value='artist4'>Rembrandt Harmenszoon van Rijn<br />" +
				"<input type='submit' value=' OK ' />" +
				"</form>" +
				"</body></html>");
		print.close();
		
	}
	
	
}
