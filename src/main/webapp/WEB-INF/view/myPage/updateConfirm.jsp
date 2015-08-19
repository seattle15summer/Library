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
        <h2>自分の情報を編集する(確認画面)</h2>
        
        <p>名前：${userViewDto.name}</p>
        <p>ふりがな：${userViewDto.nameKana}</p>
        <p>メールアドレス：${userViewDto.mail}"</p>
        
        <s:form>
        <p><input type="submit" name="UpdateComplete" value="更新する"></p>
        <p><input type="button" value="前のページに戻る" onClick="history.go(-1);"></p>
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