<%@ page contentType="text/html; charset=utf-8" language="java"  isErrorPage="true"%>
<html>
<head>
<title>错误页面</title>
</head>

<body>
   <div id="error">发生了以下错误：</div><br><hr>
   <%=exception.getMessage()%><br><hr>
   <br>
   请重新登陆：<a href='index.jsp'>登陆</a>
</body>
</html>