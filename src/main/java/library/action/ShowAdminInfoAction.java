/**
 * 
 */
package library.action;

import org.seasar.struts.annotation.Execute;

/**
 * 管理者情報表示用アクションクラス.
 * 
 * @author andoharuka
 */
public class ShowAdminInfoAction {

	@Execute(validator = false)
	public String index() {
		return "index.jsp";

	}
}
