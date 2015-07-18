<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<title>新規登録</title>
</head>

<body>
<div align="center">
<h1>新規登録</h1>
</div>

<html:errors/>
<div align="center">
<s:form>
  <dl>
    <dt>名前</dt>
      <dd>
      <input type="text" name="name value="${newUserRegisterForm.name}" placeholder="名前"/>
      </dd>
  </dl>
  <dl>
    <dt>フリガナ</dt>
      <dd>
      <input type=text name="nameKana" value="${newUserRegisterForm.nameKana}" placeholder="フリガナ"/>
      </dd>
  </dl>
  <dl>
    <dt>パスワード</dt>
      <dd>
      <input type=text name="password" value="${newUserRegisterForm.password}" placeholder="パスワード"/>
      </dd>
  </dl>
  <dl>
    <dt>メール</dt>
      <dd>
      <input type=text name="mail" value="${newUserRegisterForm.mail}" placeholder="メール"/>
      </dd>
  </dl>

  <input type="submit" name="goRegisterConfirm" value="確認画面へ">
</s:form>
</div>
</body>
</html>