<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<%-- <link rel="stylesheet" type="text/css" href="${f:url('/css/style.css')}"> --%>
<title>マイページ</title>
</head>
<body>
    <div class="header">
      <div class="logo">Liberty & Library</div>
    </div>
    <div class="leftnav">
      <ul>
        <li> <a href="../userPage">トップ画面</a></li>
        <li> <a href="../searchBook">本の検索</a></li>
        <li> <a href="">マイページ</a></li>
      </ul>
    </div>
    <div class="body">
      <div class="content">
        <p>パスワードを更新します</p>
        <s:form>
        <p>${errorMessage }</p>
        <table>
        	<tr>
        		<td>現在のパスワード：</td><td><input type=password name="currentPassword" required/></td>
        	</tr>
        	<tr>
        		<td>新しいパスワード：</td><td><input type=password name="newPassword" required/></td>
        	</tr>
        	<tr>
        		<td>新しいパスワード(確認用)：</td><td><input type=password name="newConfirmPassword" required/></td>
        	</tr>
        </table>
        <input type="submit" name="registerPassword" value="新しいパスワードを登録">
		</s:form>
      </div>
    </div>
    <div class="footer">
      <div class="rights">
        <p>All Rights Reserved by Seattle Consulting Team15.</p>
      </div>
    </div>
  </body>
</html>