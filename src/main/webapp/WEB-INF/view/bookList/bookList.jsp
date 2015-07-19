<%@ page pageEncoding="UTF-8"%>
<html>
<head>
<title>検索結果</title>
</head>
<body>
  <div class="header">
    <div class="logo">Liberty & Library</div>
  </div>
  <div class="leftnav">
    <ul>
      <li> <a href="../">トップ画面</a></li>
      <li> <a href="../searchBook">本の検索</a></li>
      <li> <a href="../myPage">マイページ</a></li>
    </ul>
  </div>
 <section id="main" align="center">
 <h2>Recomember一覧</h2>
	 <html:errors/>
 <br />
 <s:form action="/searchRecomemberInfo/">
  <input type="text" name="searchText" placeholder="検索ワードを入力">
  <input type="submit" name="serchRecomemberInfo" value="検索">
 </s:form>
 全部で<strong>${total}</strong>件のデータがあります。
 <c:if test="${total !=0}">
  <table align="center" border = "1">
   <tr>
    <th>会話したこと</th>
    <th>名前</th>
    <th>電話番号</th>
    <th>好きな食べ物のジャンル</th>
    <th>誕生年</th>
    <th>誕生月</th>
    <th>誕生日</th>
    <th>ノート</th>
    <th>情報編集</th>
    <th>情報削除</th>
   </tr>
   <c:forEach var="recomember" items="${recomemberInfoDto.recomemberInfoDtos}">
   <tr>
     <td>${recomember.talkStatus}</td>
     <td>${recomember.memberName}</td>
     <td>${recomember.phoneNumber}</td>
     <td>${recomember.favoriteFood}</td>
     <td>${recomember.birthYear}</td>
     <td>${recomember.birthMonth}</td>
     <td>${recomember.birthDay}</td>
     <td>${recomember.Note}</td>
     <td>
      <s:form action="/recomemberEdit">
     <input type="hidden" value="${recomember.recomemberId}" name="recomemberId">
     <input type="submit" name="editRecomember" value="編集">
     </s:form>
     <td>
     <s:form action="/recomemberDelete">
     <input type="hidden" value="${recomember.recomemberId}" name="recomemberId">
     <input type="submit" name="deleteConfirm" value="削除確認">
     </s:form>
   </tr>
 </c:forEach>
  </table>
</c:if>
 <c:if test="${hasPrev}">
  <a href="?page=${page - 1}">前へ</a>
 </c:if>
  <c:if test="${hasNext}">
  <a href="?page=${page + 1}">次へ</a>
 </c:if>
</section>
  <footer id="footer" align="center">
 All rights reserved by Recom
 </footer>
</body>
</html>