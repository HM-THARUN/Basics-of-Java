package lab9a;


	import java.io.*;
	import java.util.Date;
	import javax.servlet.*;
	import javax.servlet.http.*;
	import javax.servlet.annotation.WebServlet;

	@WebServlet("/SessionServlet")
	public class SessionServlet extends HttpServlet {

	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();

	        // Get session object (create if not exists)
	        HttpSession session = request.getSession(true);

	        // Set session timeout = 60 seconds
	        session.setMaxInactiveInterval(60);

	        Integer visitCount = (Integer) session.getAttribute("visitCount");

	        if (visitCount == null) {
	            visitCount = 1;
	        } else {
	            visitCount++;
	        }

	        session.setAttribute("visitCount", visitCount);

	        // Session details
	        String sessionId = session.getId();
	        Date creationTime = new Date(session.getCreationTime());
	        Date lastAccessTime = new Date(session.getLastAccessedTime());

	        // Output
	        out.println("<html><body>");

	        out.println("<h2>Session Tracking Information</h2>");

	        out.println("<p><b>Session ID:</b> " + sessionId + "</p>");
	        out.println("<p><b>Session Creation Time:</b> " + creationTime + "</p>");
	        out.println("<p><b>Last Access Time:</b> " + lastAccessTime + "</p>");
	        out.println("<p><b>Visit Count:</b> " + visitCount + "</p>");

	        out.println("<p><b>Session Timeout:</b> 60 seconds</p>");
	        out.println("<p>Refresh the page to increase visit count.</p>");
	        out.println("<p>Wait 1 minute → session expires → count resets.</p>");

	        out.println("<br><a href='SessionServlet'>Refresh Page</a>");
	        out.println("<br><a href='index.html'>Back</a>");

	        out.println("</body></html>");
	    }
	}

