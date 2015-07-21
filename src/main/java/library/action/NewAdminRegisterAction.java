package library.action;

import javax.annotation.Resource;

import library.dto.NewAdminRegisterDto;
import library.form.NewAdminRegisterForm;
import library.service.NewAdminRegisterService;

import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

/**
 * 管理者新規登録アクション.
 * 
 * @author andoharuka
 */
public class NewAdminRegisterAction {

	@ActionForm
	@Resource
	public NewAdminRegisterForm newAdminRegisterForm;

	@Resource
	public NewAdminRegisterService newAdminRegisterService;

	public NewAdminRegisterDto newAdminRegisterDto;

	/**
	 * 管理者登録ページに遷移する
	 * 
	 * @return 管理者登録フォーム
	 */
	@Execute(validator = false)
	public String index() {
		return "index.jsp";
	}

	/**
	 * 登録内容の確認画面に遷移する
	 * 
	 * @return 管理者登録確認画面
	 */
	@Execute(validator = true, input = "index.jsp")
	public String adminRegisterConfirm() {

		newAdminRegisterDto.name = newAdminRegisterForm.name;
		newAdminRegisterDto.nameKana = newAdminRegisterForm.nameKana;
		newAdminRegisterDto.password = newAdminRegisterForm.password;
		newAdminRegisterDto.mail = newAdminRegisterForm.mail;

		return "adminRegisterConfirm.jsp";
	}

	/**
	 * 管理者新規登録完了画面へ遷移する
	 * 
	 * @return 管理者登録完了画面
	 */
	@Execute(validator = false)
	@RemoveSession(name = "newUserRegisterDto")
	public String adminRegisterCompleted() {

		newAdminRegisterService.insert(newAdminRegisterDto);

		return "adminRegisterCompleted.jsp";
	}

	/**
	 * 管理者新規登録入力フォームへ戻る
	 * 
	 * @return 管理者新規登録画面
	 */
	@Execute(validator = false)
	public String backToIndex() {

		newAdminRegisterForm.name = newAdminRegisterDto.name;
		newAdminRegisterForm.nameKana = newAdminRegisterDto.nameKana;
		newAdminRegisterForm.password = newAdminRegisterDto.password;
		newAdminRegisterForm.mail = newAdminRegisterDto.mail;

		return "index.jsp";
	}
}
