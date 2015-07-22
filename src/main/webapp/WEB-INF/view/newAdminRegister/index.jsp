<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href='../css/adminStyle.css'>
<!-- <link rel="stylesheet" type="text/css" href='../css/adminRegister.css'> -->
<title>管理者新規登録フォーム</title>
</head>

<body>

<div class="header">
	<div class="logo">Liberty & Library</div>
	<div class="logout"><a href="${f:url("/adminLogout")}">ログアウト</a></div>
</div>

<!-- <div align="center">
<h1>管理者新規登録フォーム</h1>
</div> -->

<html:errors/>
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
				<s:form>
					  <dl>
					    <dt>名前</dt>
					      <dd>
					      <input type=text name="name" value="${newAdminRegisterForm.name}" placeholder="名前"/>
					      </dd>
					  </dl>
					  <dl>
					    <dt>フリガナ</dt>
					      <dd>
					      <input type=text name="nameKana" value="${newAdminRegisterForm.nameKana}" placeholder="フリガナ"/>
					      </dd>
					  </dl>
					  <dl>
					    <dt>パスワード</dt>
					      <dd>
					      <input type=text name="password" value="${newAdminRegisterForm.password}" placeholder="パスワード"/>
					      </dd>
					  </dl>
					  <dl>
					    <dt>メール</dt>
					      <dd>
					      <input type=text name="mail" value="${newAdminRegisterForm.mail}" placeholder="メール"/>
					      </dd>
					  </dl>
				  <input type="submit" name="adminRegisterConfirm" value="登録確認">
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