<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" errorPage="error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="../css/style.css">
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
		<form action="/StudentManage/servlet/AddStudentServlet" method="post">
			学号：<input type="text" name="id" /><br> 
			姓名：<input type="text" name="name" /><br>
			年龄：<input type="text" name="age" /><br> 
			性别：<input type="text" name="sex" /><br>
			生日：<input type="text" name="birthday" /><br> 
			班级：<input type="text"
				name="classname" /><br>	<br> 
				<input type="submit" name="btnOk" value="提交" />&nbsp;&nbsp; <input
				type="reset" name="btnCanel" value="重置" />
		</form>

	</div>
	<div class="footer"><jsp:include page="../Footer.jsp"></jsp:include></div>
</body>
</html>