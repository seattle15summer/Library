/**
 * 
 */
package library.action;

import javax.annotation.Resource;

import library.dto.AdminInfoDto;
import library.form.AdminLoginForm;
import library.service.AdminLoginService;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

/**
 * 管理者ログイン用アクションクラス.
 * 
 * @author andoharuka
 */
public class AdminLoginAction {

	@ActionForm
	@Resource
	protected AdminLoginForm adminLoginForm;

	@Resource
	protected AdminInfoDto adminInfoDto;

	@Resource
	protected AdminLoginService adminLoginService;

	/**
	 * @return ログイン画面
	 */
	@Execute(validator = false)
	public String index() {
		return "index.jsp";
	}

	/**
	 * ログイン判定
	 * 
	 * @return　成功ならマイページへ 　失敗ならログイン画面へ遷移
	 */
	@Execute(validator = false, input = "index?redirect=true", removeActionForm = true)
	public String judgeAdminLogin() {

		
		if(adminLoginService.isAdminExist(adminLoginForm.mail, adminLoginForm.password)){
			
			adminInfoDto.mail = adminLoginForm.mail;
			adminInfoDto.password = adminInfoDto.password;
			
			return "/adminTop/index?redirect=true";
		}
		return "index.jsp";
	}
}
