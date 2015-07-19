<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href='../css/login.css'>
<link rel="stylesheet" type="text/css" href='../css/style.css'>
<title>ログイン</title>
</head>
<body>

<div class="header">
	<div class="logo">Liberty & Library</div>
</div>

<div class="wrapper">
  <div class="login_wrapper">
    <div class="title"> <a>ログイン画面</a></div>
    <div class="login_form">
      <div class="form_wrapper">
      
<s:form method="POST" >
	<div class="id_form">
		<div class="form_item"><a>user id</a></div>
		<input type="email" name="mail"><html:errors property="mail"/>
    </div>
    <div class="pass_form">
    	<div class="form_item"><a>password</a></div>
		<input type="password" name="password"><html:errors property="password"/>
	</div>
	<div class="login_btn">
		<input type="submit" name="judgeLogin" value="ログイン">
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