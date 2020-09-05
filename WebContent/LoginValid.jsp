<%@ page language="java" contentType="text/html; charset=utf-8"  pageEncoding="utf-8" errorPage="error.jsp" %>
<%@page import="jdbc.UserLogin"%>
<%
	String name=request.getParameter("name");
    String password=request.getParameter("password");
    boolean successflag=UserLogin.validlogin(name, password);
    if(successflag==true){
    	session.setAttribute("userName", name);
    	response.sendRedirect("TestMain.jsp");
    }else{
    	//response.setStatus(200);
    	throw new Exception("用户名或密码不正确，登陆失败！");
    	
    }
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>校验登陆是否成功</title>
	</head>
	<body>
		
	</body>
</html>