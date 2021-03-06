/**
 * 
 */
package library.action;

import javax.annotation.Resource;

import library.dto.UserInfoDto;
import library.form.UserLoginForm;
import library.service.UserLoginService;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

/**
 * @author masayukitooyama
 *
 */
public class UserLoginAction {
	
	@ActionForm
	@Resource
	protected UserLoginForm userLoginForm;
	
	@Resource
	protected UserInfoDto userInfoDto;
	
	@Resource
	protected UserLoginService userLoginService;
	
	/**
	 * @return ログイン画面
	 */
	@Execute(validator = false)
	public String index(){
		return "index.jsp";
	}
	
	/** 
	 * ログイン判定
	 * @return　
	 * 　成功ならマイページへ
	 * 　失敗ならログイン画面へ遷移
	 */
	@Execute(validator = false, input = "index?redirect=true", removeActionForm=true)
	public String judgeLogin(){
		
		if(userLoginService.isUserExist(userLoginForm.mail, userLoginForm.password)){
			
			userInfoDto.mail = userLoginForm.mail;
			userInfoDto.password = userLoginForm.password;
			
			return "/userPage/index?redirect=true";
		}
		return "index.jsp";
	}
}
