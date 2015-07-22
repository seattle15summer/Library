<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href='../css/adminLogin.css'>
<link rel="stylesheet" type="text/css" href='../css/adminStyle.css'>
<title>管理者ログイン</title>
</head>

<body>

<div class="header">
	<div class="logo">Liberty & Library</div>
</div>


<p>管理者 Login</p>

<div class="wrapper">
  <div class="login_wrapper">
    <div class="title"> <a>ログイン画面</a></div>
    <div class="login_form">
      <div class="form_wrapper">
<s:form method="POST" >
	<div class="id_form">
	<div class="form_item"><a>user id</a></div>
	<input type="mail" name="mail"><html:errors property="mail"/>
	</div>
	<div class="pass_form">
	<div class="form_item"><a>password</a></div>
	<input type="password" name="password"><html:errors property="password"/>
	</div>
	<div class="login_btn">
	<input type="submit" name="judgeAdminLogin" value="ログイン">
	</div>
</s:form>
      </div>
    </div>
  </div>
 </div>

 <div class="footer">
	<div class="rights">
		<p>All Rights Reserved by <a href link="http://www.seattleconsulting.co.jp/">Seattle Consulting</a> Team15.</p>
	</div>
</div>

</body>
</html>