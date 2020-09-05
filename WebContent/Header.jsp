<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <% request.setCharacterEncoding("utf-8");
       response.setCharacterEncoding("utf-8");
    %>
<div align="center" style="font-size:30pt">欢迎使用网络14级的管理系统</div>
<% //String userName=java.net.URLDecoder.decode(request.getParameter("userName"),"utf-8");
	String userName="";
	if(session.getAttribute("userName")==null)
		response.sendRedirect("../index.jsp");
	else
		userName=session.getAttribute("userName").toString();//从session中获得登录网页中放入的userName对象
	String currentDate=	new java.util.Date().toLocaleString();
%>
<div>当前时间是：<%= currentDate %>&nbsp;&nbsp;&nbsp;&nbsp;当前用户是：<%= userName %>
</div>