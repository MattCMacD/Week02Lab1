<%-- 
    Document   : agecalc
    Created on : Sep 21, 2017, 2:04:14 PM
    Author     : 728918
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age next birthday</h1><br>
        <form action="mainpage" method="post">
            Enter your current age: <input type="textfield" name="currentage"><input type="submit" value="Age next birthday">
        </form>
        ${output}
    </body>
</html>
