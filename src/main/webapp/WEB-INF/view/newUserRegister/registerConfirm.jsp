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
			<h1>新規登録：確認</h1>
			</div>
			<html:errors/>
			<div align="center">
			  <table>
			    <tr>
			      <td>
			        ●名前
			      </td>
			      <td>
			        ${f:h(newUserRegisterDto.name)}
			      </td>
			    </tr>
			    <tr>
			      <td>
			        ●フリガナ
			      </td>
			      <td>
			        ${f:h(newUserRegisterDto.nameKana)}
			      </td>
			    </tr>
			    <tr>
			      <td>
			        ●パスワード
			      </td>
			      <td>
			        ${f:h(newUserRegisterDto.password)}
			      </td>
			    </tr>
			    <tr>
			      <td>
			        ●メール
			      </td>
			      <td>
			        ${f:h(newUserRegisterDto.mail)}
			      </td>
			    </tr>
			  </table>
			  </div>
			<s:form>
			  <div align="center">
			    <input type="submit" name="goBackInput" value="戻る">
			    <input type="submit" name="goRegisterCompleted" value="登録">
			  </div>
			</s:form>
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