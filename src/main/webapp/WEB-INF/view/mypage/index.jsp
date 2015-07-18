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
        <li> <a href="../search_book">本の検索</a></li>
        <li> <a href="">マイページ</a></li>
      </ul>
    </div>
    <div class="body">
      <div class="content">
        <p>自分の情報</p>
        
        <p>${remindMessage}</p>
        
        <p>名前</p><p>${userViewDto.name}</p>
        <p>ふりがな</p><p>${userViewDto.nameKana}
        <p>ステータス</p><p>${userViewDto.status}</p>
        <p>本を借りた日</p><p>${userViewDto.borrowDay}</p>
        <p>本の返却日</p><p>${userViewDto.returnDay}</p>
        
        
        <p>借りている本</p>

        <p>パスワード変更</p>
      </div>
    </div>
    <div class="footer">
      <div class="rights">
        <p>All Rights Reserved by Seattle Consulting Team15.</p>
      </div>
    </div>
  </body>
</html>