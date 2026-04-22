package lab8b;


	import java.io.*;
	import javax.servlet.*;
	import javax.servlet.http.*;
	import javax.servlet.annotation.WebServlet;

	@WebServlet("/VisitServlet")
	public class VisitServlet extends HttpServlet {

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();

	        String username = request.getParameter("username");
	        int visitCount = 1;

	        Cookie[] cookies = request.getCookies();
	        boolean userFound = false;

	        // Read existing cookies
	        if (cookies != null) {
	            for (Cookie c : cookies) {

	                if (c.getName().equals("username")) {
	                    username = c.getValue();
	                    userFound = true;
	                }

	                if (c.getName().equals("visitCount")) {
	                    visitCount = Integer.parseInt(c.getValue());
	                    visitCount++;
	                }
	            }
	        }

	        // Create / Update cookies
	        Cookie nameCookie = new Cookie("username", username);
	        Cookie countCookie = new Cookie("visitCount", String.valueOf(visitCount));

	        // Set expiry time (60 seconds)
	        nameCookie.setMaxAge(60);
	        countCookie.setMaxAge(60);

	        response.addCookie(nameCookie);
	        response.addCookie(countCookie);

	        // HTML Output
	        out.println("<html><body>");

	        out.println("<h2>Welcome back " + username + "!</h2>");
	        out.println("<h3>You have visited this page " + visitCount + " times</h3>");

	        // Display cookies with values
	        out.println("<h3>Cookies List (Name & Value):</h3>");

	        if (cookies != null && cookies.length > 0) {
	            out.println("<table border='1'>");
	            out.println("<tr><th>Cookie Name</th><th>Cookie Value</th></tr>");

	            for (Cookie c : cookies) {
	                out.println("<tr>");
	                out.println("<td>" + c.getName() + "</td>");
	                out.println("<td>" + c.getValue() + "</td>");
	                out.println("</tr>");
	            }

	            out.println("</table>");
	        } else {
	            out.println("<p>No cookies found</p>");
	        }

	        // Expiry demonstration
	        out.println("<p><b>Note:</b> Cookies will expire in 60 seconds.</p>");
	        out.println("<p>After expiry, visit count will reset.</p>");

	        out.println("<br><a href='index.html'>Visit Again</a>");

	        out.println("</body></html>");
	    }
	}

