<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" errorPage="error.jsp"%>
<%@page import="jdbc.*,java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="../css/style.css">
<link rel="stylesheet" type="text/css" href="../css/common.css" />
<title>网络14级成绩管理系统</title>
</head>
<body>
	<div class="header">
		<jsp:include page="../Header.jsp"></jsp:include>
	</div>
	<div class="menu">
		<jsp:include page="../Left.jsp"></jsp:include>
	</div>
	<div class="content" id="mainDiv">
		这是主工作区，显示主要的网页内容<br>
		<%
			List<Student> list = StudentCRUD.getStudent();
		%>
		<table class="mtable2">
			<caption>学生列表</caption>
			<tr>
				<th>学号</th>
				<th>姓名</th>
				<th>性别</th>
				<th>班级</th>
				<th>年龄</th>
				<th>出生日期</th>
				<th>修改</th>
				<th>删除</th>
			</tr>
			<%
				for (int i = 0; i < list.size(); i++) {
			%>
			<tr>
				<td><%=list.get(i).getId()%></td>
				<td><%=list.get(i).getName()%></td>
				<td><%=list.get(i).getSex()%></td>
				<td><%=list.get(i).getClassName()%></td>
				<td><%=list.get(i).getAge()%></td>
				<td><%=list.get(i).getBirthday()%></td>
				<td><a href="UpdateStudent.jsp?id=<%=list.get(i).getId()%>">编辑</a></td>
				<td><a href="DeleteStudent_do.jsp?id=<%=list.get(i).getId()%>" onclick="if(!confirm('确定要删除吗？')) return false;">删除</a></td>
			</tr>
			<%
				}
			%>
		</table>

	</div>
	<div class="footer"><jsp:include page="../Footer.jsp"></jsp:include></div>
</body>
</html>