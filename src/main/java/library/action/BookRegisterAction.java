/**
 * 
 */
package library.action;

import javax.annotation.Resource;

import library.dto.BookDto;
import library.form.BookRegisterForm;

import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

/**
 * @author masayukitooyama
 *
 */
public class BookRegisterAction {
	
	
	@ActionForm
	@Resource
	public BookRegisterForm bookRegisterForm;
	
	public BookDto bookDto;
	
	/** 
	 * 本の登録画面
	 * 
	 */
	@Execute(validator = false)
	public String index(){
		return "bookRegister.jsp";
	}
	
	/**
	 * 登録確認画面
	 * @return
	 */
	@Execute(validator = true, input = "/book/index.jsp")
	public String registerConfirm(){
		bookDto.title = bookRegisterForm.title;
		return "bookRegisterConfirm.jsp";
	}
	
	/**
	 * 登録完了画面
	 * 
	 */
	@Execute(validator = false)
	@RemoveSession(name = "BookDto")
	public String registerComplete(){
		return "bookRegisterComplite.jsp";
	}
	
	/**
	 * トップ画面へ遷移
	 */
	public String goTop(){
		return "/userPage/index?redirect=true";
	}
}
