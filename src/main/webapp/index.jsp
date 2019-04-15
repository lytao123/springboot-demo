<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="<%=request.getContextPath() %>/index">Hello SpringBoot</a><br>

<form action="/fileUpload" method="post" enctype="multipart/form-data">
<input type="file" name="files" multiple="multiple"><br>
<input type="submit" value="submit"><br>
</form>

<a href="<%=request.getContextPath() %>/renderJsp">渲染JSP页面</a><br>

</body>
</html>

