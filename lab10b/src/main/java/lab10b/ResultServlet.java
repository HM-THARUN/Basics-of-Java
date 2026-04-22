package lab10b;

	import java.io.*;
	import javax.servlet.*;
	import javax.servlet.http.*;
	import javax.servlet.annotation.WebServlet;

	@WebServlet("/ResultServlet")
	public class ResultServlet extends HttpServlet {

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

	        String rollno = request.getParameter("rollno");
	        String name = request.getParameter("name");

	        String s1 = request.getParameter("sub1");
	        String s2 = request.getParameter("sub2");
	        String s3 = request.getParameter("sub3");
	        String s4 = request.getParameter("sub4");
	        String s5 = request.getParameter("sub5");

	        // Server-side validation
	        if (rollno == null || rollno.isEmpty() ||
	            name == null || name.isEmpty() ||
	            s1.isEmpty() || s2.isEmpty() || s3.isEmpty() ||
	            s4.isEmpty() || s5.isEmpty()) {

	            response.getWriter().println("<h3>All fields are required!</h3>");
	            return;
	        }

	        int sub1 = Integer.parseInt(s1);
	        int sub2 = Integer.parseInt(s2);
	        int sub3 = Integer.parseInt(s3);
	        int sub4 = Integer.parseInt(s4);
	        int sub5 = Integer.parseInt(s5);

	        // Check marks range
	        if (sub1 < 0 || sub1 > 100 || sub2 < 0 || sub2 > 100 ||
	            sub3 < 0 || sub3 > 100 || sub4 < 0 || sub4 > 100 ||
	            sub5 < 0 || sub5 > 100) {

	            response.getWriter().println("<h3>Marks must be between 0 and 100</h3>");
	            return;
	        }

	        // Result calculation
	        int total = sub1 + sub2 + sub3 + sub4 + sub5;
	        double average = total / 5.0;

	        String result = "Pass";
	        if (sub1 <= 40 || sub2 <= 40 || sub3 <= 40 || sub4 <= 40 || sub5 <= 40) {
	            result = "Fail";
	        }

	        // Set attributes
	        request.setAttribute("rollno", rollno);
	        request.setAttribute("name", name);
	        request.setAttribute("sub1", sub1);
	        request.setAttribute("sub2", sub2);
	        request.setAttribute("sub3", sub3);
	        request.setAttribute("sub4", sub4);
	        request.setAttribute("sub5", sub5);
	        request.setAttribute("average", average);
	        request.setAttribute("result", result);

	        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
	        rd.forward(request, response);
	    }
	}

