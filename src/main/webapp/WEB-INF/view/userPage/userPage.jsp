<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Dolteng Auto Generated</title>

<link rel="stylesheet" type="text/css" href='../css/style.css'>
</head>

<body>

<div class="header">
	<div class="logo">Liberty & Library</div>
	<div class="logout"><a href "${f:url("logout")}">ログアウト</a></div>
</div>


<div class="clear"></div>

<div class="wrapper">
	<div class="main">
		<div class="leftnav">
		<ul>
			<li><label> <a href="">トップ画面</a></label></li>
			<li> <a href="${f:url("searchBook")}">本の検索</a></li>
			<li> <a href="${f:url("myPage")}">マイページ</a></li>
		</ul>
		</div>
		<div class="content">
			<a href="/"><img src="../img/eyecatch.jpg" width="500" height="375"/></a>
		</div>
	</div>
</div>
<div class="clear"></div>

<div class="footer">
	<div class="rights">
		<p>All Rights Reserved by <a href link="http://www.seattleconsulting.co.jp/">Seattle Consulting</a> Team15.</p>
	</div>
</div>
</body>
</html>