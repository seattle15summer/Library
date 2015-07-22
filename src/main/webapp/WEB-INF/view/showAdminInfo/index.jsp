<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href='../css/adminStyle.css'>
<title>管理者情報表示</title>
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
		    <li><a href='${f:url("/newAdminRegister")}'>管理者登録</a></li>
			<li><a href='${f:url("/showAdminInfo")}'>管理者情報</a></li>
			<li><a href='${f:url("/bookRegister")}'>本の登録</a></li>
			<li><a href='${f:url("/newUserRegister")}'>利用者の登録</a></li>
		  </ul>
		</div>
 	   <div class="content">
<!--       <div class="logo">管理者情報表示</div> -->
			<p>名前: ${adminViewDto.name}</p>
			<p>名前(カナ): ${adminViewDto.nameKana}</p>
			<p>メールアドレス:${adminViewDto.mail}</p>
			<p>パスワード:******** </p>

		</div>
	</div>
</div>


	<div class="footer">
		<div class="rights">		
		  <p>All Rights Reserved by Seattle Consulting Team15.</p>
		</div>
    </div>
</body>
</html>