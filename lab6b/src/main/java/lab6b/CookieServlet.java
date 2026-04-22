package lab6b;


	import java.io.*;
	import javax.servlet.*;
	import javax.servlet.http.*;
	import javax.servlet.annotation.WebServlet;

	@WebServlet("/CookieServlet")
	public class CookieServlet extends HttpServlet {

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();

	        String name = request.getParameter("username");

	        int visitCount = 1;

	        // Get existing cookies
	        Cookie cookies[] = request.getCookies();

	        if (cookies != null) {
	            for (Cookie c : cookies) {

	                if (c.getName().equals("visitCount")) {
	                    visitCount = Integer.parseInt(c.getValue());
	                    visitCount++;
	                }

	                if (c.getName().equals("username")) {
	                    name = c.getValue();
	                }
	            }
	        }

	        // Create/update cookies
	        Cookie nameCookie = new Cookie("username", name);
	        Cookie countCookie = new Cookie("visitCount", String.valueOf(visitCount));

	        // Set expiry time (e.g., 60 seconds)
	        nameCookie.setMaxAge(60);
	        countCookie.setMaxAge(60);

	        response.addCookie(nameCookie);
	        response.addCookie(countCookie);

	        // Display output
	        out.println("<html><body>");
	        out.println("<h2>Welcome back " + name + "!</h2>");
	        out.println("<p>You have visited this page " + visitCount + " times.</p>");
	        out.println("<p><b>Note:</b> Cookie will expire in 60 seconds.</p>");
	        out.println("<a href='index.html'>Go Back</a>");
	        out.println("</body></html>");
	    }
	}

