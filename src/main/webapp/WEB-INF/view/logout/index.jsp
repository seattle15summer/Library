<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="${f:url('/css/style.css')}"> 
<title>ログアウト</title>
</head>

<body>

<div class="header">
	<div class="logo">Liberty & Library</div>
</div>

<div class="wrapper">
	<div class="main">
		<div class="content">
			<p>ログアウトしますか？</p>
			<s:form>
				<input type="submit" name="back" value="戻る">
		        <input type="submit" name="logout" value="ログアウト">
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