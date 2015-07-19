<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>本の一覧表示</title>
</head>
<body>
<p>■□ 本の一覧</p>
<c:forEach var="list" items="${userBookListViewDto}">
	<p>${list.title}</p>
	<p>${list.author}</p>
	<p>${list.category}</p>
	<p>${list.price}</p>
	<p>${list.publisher}</p>
	<p>-------------------</p>
</c:forEach>
</body>
</html>