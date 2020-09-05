<%@ page language="java" contentType="text/html; charset=utf-8"  pageEncoding="utf-8" errorPage="error.jsp" %>
<%
	session.invalidate();
    response.sendRedirect("index.jsp");
%>
