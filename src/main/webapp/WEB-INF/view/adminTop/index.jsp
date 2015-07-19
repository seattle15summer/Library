<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <div class="header">
      <div class="logo">Liberty & Library Admin</div>
    </div>
    <div class="leftnav">
      <ul>
        <li><a href='${f:url("/newAdminRegister")}'>管理者登録</a></li>
		<li><a href='${f:url("/showAdminInfo")}'>管理者情報</a></li>
      </ul>
    </div>
    <div class="body">
    <a href='${f:url("/adminLogout")}'>ログアウト</a>
    </div>
    <div class="footer">
      <div class="rights">
        <p>All Rights Reserved by Seattle Consulting Team15.</p>
      </div>
    </div>
</body>
</html>