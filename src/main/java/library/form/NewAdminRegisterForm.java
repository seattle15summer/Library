/**
 * 
 */
package library.form;

import org.seasar.struts.annotation.Mask;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Msg;

/**
 * 管理者新規登録用Form.
 * @author andoharuka
 */
public class NewAdminRegisterForm {

	/** 名前 漢字 */
	@Maxlength(maxlength=100)
	//@Mask(mask = "^[^ -~｡-ﾟ]*$", msg = @Msg(key = "errors.fullWidth"))
	public String name;

	/** 名前 フリガナ */
	@Maxlength(maxlength=500)
	@Mask(mask = "^[\u30A0-\u30FF]+$", msg = @Msg(key = "errors.katakana"))
	public String nameKana;

	/** パスワード */
	public String password;

	/** メール */
	public String mail;
	
}
