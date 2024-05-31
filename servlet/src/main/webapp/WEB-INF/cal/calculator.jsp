<%--
  Created by IntelliJ IDEA.
  User: okkan
  Date: 2024-06-01
  Time: 오전 1:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>계산기</title>
</head>
<body>
<form action="/calc" method="post">
    첫번째 숫자: <input type="number" name="num1"/>
    연산자: <select name="op">
    <option value="+">+</option>
    <option value="-">-</option>
    <option value="*">*</option>
    <option value="/">/</option>
</select>
    두번째 숫자: <input type="number" name="num2"/>
    <button type="submit">결과 확인</button>
</form>
<hr>
<c:if test="${result}">
    <h2>계산 결과</h2>
    <p>${result}</p>
</c:if>
</body>
</html>
