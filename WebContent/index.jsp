<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<h1>Welcome to Pratik Softwares!!</h1>
<form action="./add" method="post">
<pre>
Name   : <input type="text" name="sname" /> 
<br>
EMail  : <input type="text" name="semail"/> 
<br>
Result : <input type="text" name="sresult"/>
<br>
<input type="submit" value="Register"/> 
</pre>
</form>
<br>
${msg}<br/>
<a href="details">View All Records</a>&nbsp; &nbsp; &nbsp;
<a href="index.html">Back</a> 
</body>
</html>




