<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <div class="header">
      <div class="logo">管理者情報表示</div>
<p>名前:${adminViewDto.name}</p>
<p>名前（カナ）:${adminViewDto.nameKana}</p>
<p>メールアドレス:${adminViewDto.mail}</p>
<p>パスワード:******** </p>
        <p>All Rights Reserved by Seattle Consulting Team15.</p>
      </div>
    </div>
</body>
</html>