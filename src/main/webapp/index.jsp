<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Simple polling</title>
</head>
<body>
<h1>Please answer the questions:</h1>
<form action="pullServlet" method="get">
    <p>
        Do you like Java?<br>
        <input type="radio" name="question1" value="yes">Yes<br>
        <input type="radio" name="question1" value="no">No
    </p>
    <p>
        Do you like SQL?<br>
        <input type="radio" name="question2" value="yes">Yes<br>
        <input type="radio" name="question2" value="no">No
    </p>
    <p><input type="submit" value="Poll"></p>
</form>
</body>
</html>