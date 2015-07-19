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
        <li> <a href="../">トップ画面</a></li>
        <li> <a href="../searchBook">本の検索</a></li>
        <li> <a href="">マイページ</a></li>
      </ul>
    </div>
    <div class="body">
      <div class="content">
        <h2>自分の情報</h2>
        
        <p>${remindMessage}</p>
        
        <p>名前：${userViewDto.name}</p>
        <p>ふりがな：${userViewDto.nameKana}
        
        <p>${userViewDto.status }</p>
        
        
        
        <c:if test="${!empty userViewDto.bookId}" var="flg" />
		<c:if test="${flg}">
		<h2>本の情報</h2>
		<p>本を借りた日：${userViewDto.borrowDay}</p>
        <p>本を返す日：${userViewDto.returnDay}</p>
        <p>借りている本</p>
        <p>名前：${bookDto.title}</p>
		<p>作者：${bookDto.author}</p>
		<p>カテゴリー：${bookDto.category}</p>
		<p>出版社：${bookDto.publisher}</p>
		</c:if>
		<s:form>
        <p><input type="submit" name="updatePassword" value="パスワードを変更する"></p>
        <p><input type="submit" name="deleteConfirm" value="ユーザー情報を消去する"></p>
        </s:form>
        <p></p>
      </div>
    </div>
    <div class="footer">
      <div class="rights">
        <p>All Rights Reserved by Seattle Consulting Team15.</p>
      </div>
    </div>
  </body>
</html>