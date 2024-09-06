<%--
  Created by IntelliJ IDEA.
  User: z1
  Date: 2024-09-06
  Time: 오전 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

  <h1>Custom Login Page</h1>

  <form method="post" action="/login">
    <div>
      <input type="text" name="username">
    </div>
    <div>
      <input type="password" name="password">
    </div>
    <div>
      <input type="checkbox" name="remember-me">자동 로그인
    </div>
    <div>
      <button>LOGIN</button>
    </div>
  </form>


</body>
</html>
