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
      <div class="logout"><a href="${f:url("/logout")}">ログアウト</a></div>
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
        <h2>自分の情報を編集する</h2>
        <s:form>
        <table>
        <tr>
        	<td>名前</td><td><input type="text" name ="name" value="${userViewDto.name}" required></td>
        </tr>
        <tr>
        	<td>ふりがな</td><td><input type="text" name="nameKana" value="${userViewDto.nameKana}" required></td>
        </tr>
        <tr>
        	<td>メールアドレス</td><td><input type="text" name="mail" value="${userViewDto.mail}" required></td>
        </tr>
        </table>
        
        <p><input type="submit" name="UpdateConfirm" value="確認画面へ"></p>
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