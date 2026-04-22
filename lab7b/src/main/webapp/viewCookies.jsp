<%@ page import="javax.servlet.http.Cookie" %>
<!DOCTYPE html>
<html>
<head>
    <title>Active Cookies</title>
</head>
<body>

<h2>Active Cookie List</h2>

<%
    Cookie[] cookies = request.getCookies();

    if (cookies != null) {
%>
        <table border="1">
            <tr>
                <th>Cookie Name</th>
                <th>Cookie Value</th>
            </tr>
<%
        for (Cookie c : cookies) {
%>
            <tr>
                <td><%= c.getName() %></td>
                <td><%= c.getValue() %></td>
            </tr>
<%
        }
%>
        </table>
<%
    } else {
%>
        <p>No cookies found.</p>
<%
    }
%>

<br>
<a href="index.jsp">Back to Home</a>

</body>
</html>