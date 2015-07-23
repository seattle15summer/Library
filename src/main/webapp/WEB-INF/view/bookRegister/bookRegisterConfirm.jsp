<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>

<head>
	<link rel="stylesheet" type="text/css" href="${f:url('/css/adminStyle.css')}">
	<title>登録確認画面</title>
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
			<h1>新規登録：確認</h1>
			</div>
			<html:errors/>
			<div align="center">
			  <table>
			    <tr>
			      <td>
			       タイトル
			      </td>
			      <td>
			        ${f:h(bookDto.title)}
			      </td>
			    </tr>
			  </table>
			  </div>
			<s:form>
			  <div align="center">
			    <input type="submit" name="index" value="戻る">
			    <input type="submit" name="registerComplete" value="登録">
			  </div>
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