<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理者新規登録フォーム</title>
</head>
<body>
<div align="center">
<h1>管理者新規登録フォーム</h1>
</div>

<html:errors/>
<div align="center">
<s:form>
  <dl>
    <dt>名前</dt>
      <dd>
      <input type=text name="name" value="${newAdminRegisterForm.name}" placeholder="名前"/>
      </dd>
  </dl>
  <dl>
    <dt>フリガナ</dt>
      <dd>
      <input type=text name="nameKana" value="${newAdminRegisterForm.nameKana}" placeholder="フリガナ"/>
      </dd>
  </dl>
  <dl>
    <dt>パスワード</dt>
      <dd>
      <input type=text name="password" value="${newAdminRegisterForm.password}" placeholder="パスワード"/>
      </dd>
  </dl>
  <dl>
    <dt>メール</dt>
      <dd>
      <input type=text name="mail" value="${newAdminRegisterForm.mail}" placeholder="メール"/>
      </dd>
  </dl>

  <input type="submit" name="adminRegisterConfirm" value="登録確認">
</s:form>
</div>
</body>
</html>