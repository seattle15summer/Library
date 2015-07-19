package library.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import library.dto.NewUserRegisterDto;
import library.form.NewUserRegisterForm;
import library.service.NewUserRegisterService;

import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

public class NewUserRegisterAction {

	@ActionForm
	@Resource
	public NewUserRegisterForm newUserRegisterForm;

	@Resource
	public NewUserRegisterService newUserRegisterService;

	@Resource
	protected HttpServletRequest request;

	public NewUserRegisterDto  newUserRegisterDto;

	/**
	 * 新規登録入力フォーム
	 * @return
	 */
	@Execute(validator = false)
	public String index() {
		//TokenProcessor.getInstance().saveToken(request);
		return "registerInput.jsp";
	}

	/**
	 * 新規登録確認画面へ
	 * @return
	 */
	@Execute(validator = true, input = "resisterInput.jsp")
	public String goRegisterConfirm() {

		newUserRegisterDto.name         = newUserRegisterForm.name;
		newUserRegisterDto.nameKana     = newUserRegisterForm.nameKana;
		newUserRegisterDto.password     = newUserRegisterForm.password;
		newUserRegisterDto.mail         = newUserRegisterForm.mail;

		return "registerConfirm.jsp";
	}

	/**
	 * 新規登録完了画面へ
	 * @return
	 */
	@Execute(validator = false)
	@RemoveSession(name = "newUserRegisterDto")
	public String goRegisterCompleted() {

		newUserRegisterService.insert(newUserRegisterDto);

		return "registerCompleted.jsp";
	}

	/**
	 * 新規登録入力フォームへ戻る
	 * @return
	 */
	@Execute(validator = false)
	public String goBackInput() {

		newUserRegisterForm.name         = newUserRegisterDto.name;
		newUserRegisterForm.nameKana     = newUserRegisterDto.nameKana;
		newUserRegisterForm.password     = newUserRegisterDto.password;
		newUserRegisterForm.mail         = newUserRegisterDto.mail;

		return "registerInput.jsp";
	}

	/**
	 * ワンタイムトークン
	 * @return
	 */
	/*
	public ActionMessages validate() {
		ActionMessages errors = new ActionMessages();
		if (!TokenProcessor.getInstance().isTokenValid(request, true)) {
			errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
					"errors.invalid",
					"二度押し"));
		}
		return errors;
	}
	*/
}
