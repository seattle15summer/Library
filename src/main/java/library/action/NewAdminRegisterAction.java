package library.action;

import org.seasar.struts.annotation.Execute;

/**
 * 管理者新規登録アクション.
 * @author andoharuka
 */
public class NewAdminRegisterAction {

	/**
	 * 管理者登録ページに遷移する
	 * 
	 * @return 管理者登録フォーム
	 */
	@Execute(validator = false)
	public String index() {
		return "index.jsp";
	}
}
