<%--
  Created by IntelliJ IDEA.
  User: elena
  Date: 3.03.20
  Time: 23:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FakeBank - Login</title>
</head>
<body style="background-color: skyblue">
<%--<jsp:include page="/WEB-INF/header.jsp"/>--%>
<%--<jsp:include page="/WEB-INF/footer.jsp"/>--%>
<form action="LoginRegister" method="post">
    <table style="margin-left:390px; margin-top: 190px;">
        <tr>
            <td>
                <h3 style="color: red;">${message}</h3>
                <h3 style="color: green;">${successMessage}</h3>
            </td>
            <td>

            </td>
        </tr>
        <tr>
            <td><h3>Login form</h3>
        </tr>
        <tr>
            <td>Email address:</td>
            <td><input type="text" name="email"></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td><input type="submit" name="submit" value="Login"></td>
            <td><a href="register.jsp">Registration form</a></td>
        </tr>
    </table>
</form>
</body>
</html>
