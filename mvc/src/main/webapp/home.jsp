<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello Spring Boot MVC</title>
</head>
<body style="text-align: center;">
    <h2>Welcome to Home page</h2>
    <form action="addCustumer" method="post">
        <input type="text" name="name" placeholder="name"> <br>
        <input type="text" name="city" placeholder="city"> <br>
        <input type="email" name="email" placeholder="email"> <br>
        <input type="submit" value="submit">
    </form>
</body>
</html>