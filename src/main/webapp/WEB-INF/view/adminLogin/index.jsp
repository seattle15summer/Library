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
	メールアドレス：<input type="email" property="mail"><html:errors property="mail"/></br>
	パスワード:<input type="password" property="password"><html:errors property="password"/></br>
	<input type="submit" name="login" value="ログイン">
</s:form>
</body>
</html>