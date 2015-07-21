<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href='../css/style.css'>
<link rel="stylesheet" type="text/css" href='../css/searchBook.css'>
<title>本の検索</title>
</head>
<body>
    <div class="header">
      <div class="logo">Liberty & Library</div>
    </div>
    
    <div class="wrapper">
		<div class="main">
    		<div class="leftnav">
		      <ul>
		        <li> <a href="${f:url("userPage")}">トップ画面</a></li>
		        <li> <a href="${f:url("index")}">本の検索</a></li>
		        <li> <a href="${f:url("myPage")}">マイページ</a></li>
		      </ul>
		    </div>

			<div class="content">
		        <s:form>
		         タイトル：<input name="searchText" type="text" placeholder="本のタイトルを入力"/>
		        <input type="submit" name="searchBookInfo" value="検索">
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