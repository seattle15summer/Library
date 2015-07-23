<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<link rel="stylesheet" type="text/css" href='../css/adminStyle.css'>
	<title>新規登録</title>
</head>

<body>

<div class="header">
	<div class="logo">Liberty & Library</div>
	<div class="logout"><a href="${f:url("/adminLogout")}">ログアウト</a></div>
</div>

<div class="wrapper">
	<div class="main">
		<div class="content">
			<div align="center">
				<h1>新規登録完了</h1>
				新規登録が完了しました。
			</div>
			<html:errors/>
			<div align="center">
			<s:form>
			  <input type="submit" name="goTop" value="Topへ">
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