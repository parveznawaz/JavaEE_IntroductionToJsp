<%@page import="com.parvez.Person"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result</title>
</head>
<body>
<%-- 
<% Person p=(Person)request.getAttribute("person"); %>
Welcome <%=p.getName() %>
--%>

<jsp:useBean id="person1" class="com.parvez.Person" scope="request">
	<jsp:setProperty name="person1" property="name" value="Parvez" />
</jsp:useBean>
Welcome <jsp:getProperty property="name" name="person1"/>

</body>
</html>