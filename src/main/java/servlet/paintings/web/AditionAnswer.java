package servlet.paintings.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/aditionanswer")

public class AditionAnswer extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		String answer = "artist3";
		boolean b = false;
		
		PrintWriter print = response.getWriter();
		
		
		for (String art : request.getParameterValues("artist")) {
			if (art.equalsIgnoreCase(answer)) {
				b = true;
			}
		}
		
		print.print("<html><body><h2>Your answer</h2>" +
				"<p>First name: " + request.getParameter("firstName") + "<br />");
		
				if (b) {

					print.print("<p>Your ansver is correct: Vincent Willem van Gogh <br />");
				}
				else {
					print.print("<p>Your ansver is not correct: <br />"
							+ "<p> Try again <br />");
				}
				
		print.println("<p><a href='index.jsp'></p> To start point </body></html>");
				
		print.close();
	}

	
}
