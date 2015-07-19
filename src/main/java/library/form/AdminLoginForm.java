package library.form;

import org.seasar.struts.annotation.Required;

/**
 * 管理者ログイン用Formクラス.
 * メールアドレス/パスワードで認証する.
 * @author andoharuka
 */
public class AdminLoginForm {

	@Required
	public String mail;
	
	@Required
	public String password;

}
