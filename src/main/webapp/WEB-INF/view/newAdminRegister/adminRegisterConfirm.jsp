<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理者登録確認</title>
</head>
<body>
<div align="center">
<h1>管理者登録確認</h1>
</div>
<html:errors/>
<div align="center">
  <table>
    <tr>
      <td>
        ●名前
      </td>
      <td>
        ${f:h(newAdminRegisterDto.name)}
      </td>
    </tr>
    <tr>
      <td>
        ●フリガナ
      </td>
      <td>
        ${f:h(newAdminRegisterDto.nameKana)}
      </td>
    </tr>
    <tr>
      <td>
        ●パスワード
      </td>
      <td>
        ${f:h(newAdminRegisterDto.password)}
      </td>
    </tr>
    <tr>
      <td>
        ●メール
      </td>
      <td>
        ${f:h(newAdminRegisterDto.mail)}
      </td>
    </tr>
  </table>
  </div>
<s:form>
  <div align="center">
    <input type="submit" name="backToIndex" value="戻る">
    <input type="submit" name="adminRegisterCompleted" value="登録">
  </div>
</s:form>
</body>
</html>