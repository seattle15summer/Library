/**
 * 
 */
package library.form;


import org.seasar.struts.annotation.Maxlength;

/**
 * @author nagaimidori
 *
 */

public class UserInfoForm {

	
	/** 現在のパスワード */
	public String currentPassword;
	
	/** 新しいパスワード(確認用) */
	public String newConfirmPassword;
	
	/** 新しいパスワード */
	public String newPassword;
	
	/** メールアドレス*/
	public String mail;
	
	/** 名前 */
	@Maxlength(maxlength=100)
	public String name;
	
	/**　ふりがな */
	@Maxlength(maxlength=500)
	public String nameKana;
}
