<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="${f:url('/css/style.css')}">
<title>マイページ</title>
</head>

<body>

    <div class="header">
      <div class="logo">Liberty & Library</div>
      <div class="logout"><a href="${f:url("/logout")}">ログアウト</a></div>
    </div>
    <div class="wrapper">
	    <div class="main">
	    <div class="leftnav">
	      <ul>
	        <li> <a href="../userPage">トップ画面</a></li>
	        <li> <a href="../searchBook">本の検索</a></li>
	        <li> <a href="">マイページ</a></li>
	      </ul>
	    </div>
	
	      <div class="content">
	        <p>ユーザー情報を消去いたしました。</p>
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