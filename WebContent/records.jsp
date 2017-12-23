<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    import="java.util.*,com.app.model.*"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Page</title>
<style type="text/css">
table tr th {
	color: white;
	background-color: red;
}

</style>
</head>
<body>
	<h1>This is View All Records Page!!</h1>
	<font size="20">
		<table border="1" >
			<tr>
				<th>Id</th><th>Name</th><th>EMail</th><th>Result</th>
			</tr>
		<c:forEach items="${studList}" var="stud">
			<tr>
					<td><c:out value="${stud.sid}"/></td>
						<td><c:out value="${stud.sname}"/></td>
							<td><c:out value="${stud.semail}"/></td>
								<td><c:out value="${stud.sresult}"/></td>
				</tr>
		</c:forEach>
	</table>
</font>
<font size="16">
<%
int numberOfPages=(Integer)request.getAttribute("numberOfPages");
for(int i=1;i<=numberOfPages;i++){
	out.print("<a href=\"details?pageNumber="+i+"\">"+i+"</a> ");
}
%>
&nbsp; &nbsp; &nbsp;
<a href="index.html">Back</a> 
</font>
</body>
</html>





