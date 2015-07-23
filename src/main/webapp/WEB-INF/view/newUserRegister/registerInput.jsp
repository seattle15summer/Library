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
			  <dl>
			    <dt>名前</dt>
			      <dd>
			      <input type=text name="name" value="${newUserRegisterForm.name}" placeholder="名前"/>
			      </dd>
			  </dl>
			  <dl>
			    <dt>フリガナ</dt>
			      <dd>
			      <input type=text name="nameKana" value="${newUserRegisterForm.nameKana}" placeholder="フリガナ"/>
			      </dd>
			  </dl>
			  <dl>
			    <dt>パスワード</dt>
			      <dd>
			      <input type=text name="password" value="${newUserRegisterForm.password}" placeholder="パスワード"/>
			      </dd>
			  </dl>
			  <dl>
			    <dt>メール</dt>
			      <dd>
			      <input type=text name="mail" value="${newUserRegisterForm.mail}" placeholder="メール"/>
			      </dd>
			  </dl>
			
			  <input type="submit" name="goRegisterConfirm" value="確認画面へ">
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