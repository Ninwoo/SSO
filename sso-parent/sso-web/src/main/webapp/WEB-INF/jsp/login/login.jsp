<%--
  Created by IntelliJ IDEA.
  User: ninwoo
  Date: 19-6-22
  Time: 上午11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<h2 align="center"><font color="red">用户登陆页面</font> </h2>
<form action="/submitLogin" method="post">
    <table align="center" border="1">
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>密&nbsp;&nbsp;码</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td><input type="submit" value="登陆" name="login"></td>
            <td><input type="reset" value="重置" name="reset"></td>
        </tr>
    </table>
</form>
</body>
</html>
