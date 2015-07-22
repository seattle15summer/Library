<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="${f:url('/css/adminStyle.css')}"> 
	<title>新規登録</title>
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
			<h1>新規登録</h1>
			</div>
			
			<html:errors/>
			<div align="center">
			<s:form>
			  <ul>
			    <li>タイトル</li>
			      <li>
			      <input type="text" name="title" value="${bookRegisterForm.title}" placeholder="タイトル"/>
			      </li>
			  </ul>
			  <input type="submit" name="registerConfirm" value="確認画面へ">
			</s:form>
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