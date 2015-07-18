<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<title>新規登録</title>
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
        ●名前
      </td>
      <td>
        ${f:h(newUserRegisterDto.name)}
      </td>
    </tr>
    <tr>
      <td>
        ●フリガナ
      </td>
      <td>
        ${f:h(newUserRegisterDto.nameKana)}
      </td>
    </tr>
    <tr>
      <td>
        ●パスワード
      </td>
      <td>
        ${f:h(newUserRegisterDto.password)}
      </td>
    </tr>
    <tr>
      <td>
        ●メール
      </td>
      <td>
        ${f:h(newUserRegisterDto.mail)}
      </td>
    </tr>
  </table>
  </div>
<s:form>
  <div align="center">
    <input type="submit" name="goBackInput" value="戻る">
    <input type="submit" name="goRegisterCompleted" value="登録">
  </div>
</s:form>

</body>
</html>