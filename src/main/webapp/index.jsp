<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 23/11/2020
  Time: 1:50 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="/convert" method="post">
    <fieldset>
        <legend>
            Currency Converter
        </legend>
        <div class="form-group">
            <label for="rate">Rate:</label>
            <input type="text" name="rate" id="rate" value="22000">
        </div>
        <div class="form-group">
            <label for="usd">USD:</label>
            <input type="text" name="usd" id="usd" value="0">
        </div>
        <div class="form-group">
            <button type="submit">Converter</button>
        </div>
    </fieldset>
</form>
$END$
</body>
</html>
