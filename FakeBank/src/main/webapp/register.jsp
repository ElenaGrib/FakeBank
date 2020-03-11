<%--
  Created by IntelliJ IDEA.
  User: elena
  Date: 4.03.20
  Time: 00:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FakeBank - Registration form</title>
</head>
<body style="background-color: skyblue">
<%--<jsp:include page="/WEB-INF/header.jsp"/>--%>
<%--<jsp:include page="/WEB-INF/footer.jsp"/>--%>
<form action="/loginRegister" method="post">
    <table style="margin-left:390px; margin-top: 190px;">
        <tr>
            <td><h3>Registration form</h3>
        </tr>
        <tr>
            <td>Name:</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>Email address:</td>
            <td><input type="text" name="email"></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="password" name="password"></td>
        </tr>
            <td><input type="submit" name="submit" value="Register"></td>
        </tr>
    </table>
</form>
</body>
</html>
