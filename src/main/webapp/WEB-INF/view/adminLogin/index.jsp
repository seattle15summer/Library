<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AdminLogin</title>
</head>
<body>
<p>this is Admin login</p>
<s:form method="POST" >
	メールアドレス：<input type="mail" name="mail"><html:errors property="mail"/>
	パスワード:<input type="password" name="password"><html:errors property="password"/>
	<input type="submit" name="judgeAdminLogin" value="ログイン">
</s:form>
</body>
</html>