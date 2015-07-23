<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href='../css/adminStyle.css'>
<title>管理者新規登録完了</title>
</head>

<body>

<div class="header">
	<div class="logo">Liberty & Library</div>
	<div class="logout"><a href="${f:url("/adminLogout")}">ログアウト</a></div>
</div>

<div class="wrapper">
	<div class="main">
		<div class="leftnav">
		  <ul>
		    <li> <a href="../userPage">トップ画面</a></li>
		    <li> <a href="../searchBook">本の検索</a></li>
		    <li> <a href="">マイページ</a></li>
		    <li><a href='${f:url("/newUserRegister")}'>利用者の登録</a></li>
		  </ul>
		</div>

		<div class="content">
			<div align="center">
				<h1>管理者新規登録完了</h1>
				管理者の新規登録が完了しました。
			</div>
			<html:errors/>
			<div align="center">
			<s:form>
			  <a href='${f:url("/adminTop")}'>TOP</a>
			</s:form>
			</div>
			
			<div class="footer">
				<div class="rights">
					<p>All Rights Reserved by <a href link="http://www.seattleconsulting.co.jp/">Seattle Consulting</a> Team15.</p>
				</div>
			</div>
		</div>
	</div>
</div>

</body>
</html>