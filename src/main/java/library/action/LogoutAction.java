/**
 * 
 */
package library.action;

import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.struts.annotation.Execute;

/**
 * @author masayukitooyama
 *
 */
public class LogoutAction {
	
	@Execute(validator = false)
	@RemoveSession(name = "userInfoDto")
	public String logout() {
		return "/userLogin?redirect=true";
	}
	
}
