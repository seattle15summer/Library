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
    <dt>タイトル</dt>
      <dd>
      <input type="text" name="title" value="${bookRegisterForm.title}" placeholder="タイトル"/>
      </dd>
  </dl>
  <input type="submit" name="registerConfirm" value="確認画面へ">
</s:form>
</div>
</body>
</html>