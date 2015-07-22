<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="${f:url('/css/adminStyle.css')}"> 
	<title>登録完了</title>
</head>

<body>

<div class="header">
	<div class="logo">Liberty & Library</div>
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
			<div align="center">
				<h1>新規登録完了</h1>
				新規登録が完了しました。
			</div>
			
			<html:errors/>
			<div align="center">
				<s:form>
				  <input type="submit" name="goTop" value="トップ画面へ">
				</s:form>
			</div>
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