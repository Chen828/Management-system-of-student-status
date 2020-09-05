<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" errorPage="/StudentManage/error.jsp" %>
    <%@page import="jdbc.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("utf-8");
response.setCharacterEncoding("utf-8");
String id=request.getParameter("id");
if(StudentCRUD.deleteStudent(id)==1)
	response.sendRedirect("StudentManage.jsp");
%>
</body>
</html>