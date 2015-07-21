/**
 * 
 */
package library.action;

import org.seasar.struts.annotation.Execute;

/**
 * 管理者用トップページアクション.
 * 
 * @author andoharuka
 */
public class AdminTopAction {

	@Execute(validator = false)
	public String index() {
		return "index.jsp";
	}
}
