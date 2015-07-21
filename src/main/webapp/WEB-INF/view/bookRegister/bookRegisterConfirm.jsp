<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<title>登録確認画面</title>
</head>
<body>
<div align="center">
<h1>新規登録：確認</h1>
</div>
<html:errors/>
<div align="center">
  <table>
    <tr>
      <td>
       タイトル
      </td>
      <td>
        ${f:h(bookDto.title)}
      </td>
    </tr>
  </table>
  </div>
<s:form>
  <div align="center">
    <input type="submit" name="index" value="戻る">
    <input type="submit" name="registerComplete" value="登録">
  </div>
</s:form>

</body>
</html>