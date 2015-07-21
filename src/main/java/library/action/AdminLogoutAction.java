/**
 * 
 */
package library.action;

import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.struts.annotation.Execute;

/**
 * 管理ログアウト用クラス.
 * @author andoharuka
 */
public class AdminLogoutAction {

	@Execute(validator = false)
	@RemoveSession(name = "adminInfoDto")
	public String adminLogout() {
		return "/adminLogin?redirect=true";
	}
	
}
