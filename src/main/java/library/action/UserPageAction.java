/**
 *
 */
package library.action;

import org.seasar.struts.annotation.Execute;

/**
 *　トップ画面
 *
 */
public class UserPageAction {

	//トップページを表示するメソッド
	@Execute(validator=false)
	public String index(){
		return "userPage.jsp";
	}

	//myPageに遷移するメソッド
	@Execute(validator=false)
	public String myPage(){
		return "/myPage/index?redirect=true";
	}

	//searchBookに遷移するメソッド
	@Execute(validator=false)
	public String searchBook(){
		return "/searchBook/index?redirect=true";
	}

	//searchBookに遷移するメソッド
		@Execute(validator=false)
		public String goRegister(){
			return "/newUserRegister/index?redirect=true";
		}
}
