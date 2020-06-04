<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile Page</title>
    </head>
    <body>
        <h3>Profile</h3>
        <p>Welcome user: <%
            String username=request.getParameter("username");
            out.println(username);
        %>!</p>

        <p>Your password is: <%
            String password=request.getParameter("password");
            out.println(password);
        %></p>
    </body>
</html>