<%--
  Created by IntelliJ IDEA.
  User: szl94
  Date: 11/18/2021
  Time: 5:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/add_book">
  <input type="text" name="book_name" value="book name">
  <input type="text" name="author" value="author">
    <input type="text" name="isbn" value="1000">
    <input type="date" name="publish_Date" >
    <input type="submit" value="submit">
</form>
</body>
</html>
