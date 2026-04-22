<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Session Result</title>
</head>
<body>

<%
    // Set session timeout to 60 seconds
    session.setMaxInactiveInterval(60);

    String name = request.getParameter("username");

    // Check if session already has name
    if (session.getAttribute("username") == null && name != null) {
        session.setAttribute("username", name);
    }

    String user = (String) session.getAttribute("username");

    if (user != null) {
%>
        <h2>Hello <%= user %>!</h2>
        <p>Session is active.</p>

        <p><b>Session ID:</b> <%= session.getId() %></p>
        <p><b>Creation Time:</b> <%= new Date(session.getCreationTime()) %></p>
        <p><b>Last Access Time:</b> <%= new Date(session.getLastAccessedTime()) %></p>

        <p><b>Note:</b> Session will expire in 60 seconds.</p>
        <p>Wait 1 minute without refreshing → session expires.</p>

<%
    } else {
%>
        <h2>Session Expired!</h2>
        <p>Your session has expired after 1 minute.</p>
        <a href="index.jsp">Start Again</a>
<%
    }
%>

<br><br>
<a href="welcome.jsp">Refresh Page</a>

</body>
</html>