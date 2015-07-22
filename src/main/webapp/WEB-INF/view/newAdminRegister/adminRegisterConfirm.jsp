<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href='../css/adminStyle.css'>
<title>管理者登録確認</title>
</head>

<body>

<div class="header">
	<div class="logo">Liberty & Library</div>
	<div class="logout"><a href="${f:url("/adminLogout")}">ログアウト</a></div>
</div>

<%-- <div align="center">
<h1>管理者登録確認</h1>
</div>
<html:errors/>
 --%>
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

			  <table>
			    <tr>
			      <td>
			        ●名前
			      </td>
			      <td>
			        ${f:h(newAdminRegisterDto.name)}
			      </td>
			    </tr>
			    <tr>
			      <td>
			        ●フリガナ
			      </td>
			      <td>
			        ${f:h(newAdminRegisterDto.nameKana)}
			      </td>
			    </tr>
			    <tr>
			      <td>
			        ●パスワード
			      </td>
			      <td>
			        ${f:h(newAdminRegisterDto.password)}
			      </td>
			    </tr>
			    <tr>
			      <td>
			        ●メール
			      </td>
			      <td>
			        ${f:h(newAdminRegisterDto.mail)}
			      </td>
			    </tr>
			  </table>
			<s:form>
				<div align="center">
				  <input type="submit" name="backToIndex" value="戻る">
				  <input type="submit" name="adminRegisterCompleted" value="登録">
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