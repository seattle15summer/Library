<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href='../css/style.css'>
<title>本の検索</title>
</head>
<body>
    <div class="header">
      <div class="logo">Liberty & Library</div>
    </div>
    <div class="leftnav">
      <ul>
        <li> <a href="../userPage">トップ画面</a></li>
        <li> <a href="../searchBook">本の検索</a></li>
        <li> <a href="../myPage">マイページ</a></li>
      </ul>
    </div>
    <div class="body">
        <div class="listTable">
        全部で<strong>${total}</strong>件ヒットしました。
        <c:if test="${total !=0}">
          <table border="1">
            <thead>
              <tr>
                <th>題名</th>
                <th>著者</th>
                <th>分類</th>
                <th>出版社</th>
                <th>在庫</th>
              　<th>貸し出し状況</th>
              </tr>
              <c:forEach var="bookList" items="${bookDto.bookInfoDtos}">
              <tr>
                 <td>${bookList.title}</td>
                 <td>${bookList.author}</td>
                 <td>${bookList.category}</td>
                 <td>${bookList.publisher}</td>
                 <td>${bookList.storage}</td>
                <%-- <c:if test="${bookList.status = 0}">
                 <td><input type="submit" name="request" value="借りる"></td> --%>
                 <td>${bookList.status}</td>
                <%-- </c:if> --%>
              </tr>
              </c:forEach>
            </thead>
            <tbody></tbody>
          </table>
          </c:if>
        </div>
        <c:if test="${hasPrev}">
  		　<a href="?page=${page - 1}">前へ</a>
 		</c:if>
 		<c:if test="${hasNext}">
 		　<a href="?page=${page + 1}">次へ</a>
 		</c:if>
      </div>
    <div class="footer">
      <div class="rights">
        <p>All Rights Reserved by Seattle Consulting Team15.</p>
      </div>
    </div>
  </body>
</html>