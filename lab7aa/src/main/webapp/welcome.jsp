<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>

<%
    // Set session timeout to 1 minute (60 seconds)
    session.setMaxInactiveInterval(60);

    String name = request.getParameter("username");

    if (name != null) {
        // Store in session
        session.setAttribute("user", name);
    }

    String user = (String) session.getAttribute("user");

    if (user != null) {
%>
        <h2>Hello <%= user %>!</h2>
        <p>Your session will expire in 1 minute.</p>
<%
    } else {
%>
        <h2 style="color:red;">Session Expired!</h2>
        <p>Please enter your name again.</p>
        <a href="index.jsp">Go Back</a>
<%
    }
%>

<br><br>
<a href="welcome.jsp">Refresh Page</a>

</body>
</html>