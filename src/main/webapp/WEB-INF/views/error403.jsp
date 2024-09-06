<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: z1
  Date: 2024-09-06
  Time: 오전 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>403 Page</h1>

  <h2>${SPRING_SECURITY_403_EXCEPTION.message} </h2>

  <sec:authorize access="isAuthenticated()">
    인증은 되었으나 권한이 부족합니다. 관리자에게 문의하세요
  </sec:authorize>
</body>
</html>
