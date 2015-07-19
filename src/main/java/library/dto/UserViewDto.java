/**
 * 
 */
package library.dto;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;


/**
 * @author nagaimidori
 *
 */
@Component(instance = InstanceType.SESSION)
public class UserViewDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/**
	 * ユーザーID
	 */
	public Integer userId;

	/**
	 * 名前
	 */
	public String name;

	/**
	 * 名前（カナ）
	 */
	public String nameKana;

	/**
	 * パスワード
	 */
	public String password;

	/**
	 * メールアドレス
	 */
	public String mail;

	/**
	 * 登録日
	 */
	public String registerDay;

	/**
	 * 更新日
	 */
	public String updateDay;

	/**
	 * ステータス 0:借りている 1:かりていない
	 */
	public String status;

	/**
	 * 借りた日
	 */
	public String borrowDay;

	/**
	 * 返却予定日
	 */
	public String returnDay;

	/**
	 * リマインド日
	 */
	public String remindDay;

	/**
	 * 利用回数
	 */
	public Integer history;

	/**
	 * 本のID
	 */
	public Integer bookId;
	
	/**
	 * リマインドメッセージ
	 */
	public String remindMessage;
	
	/**
	 * 借りた本の名前
	 */
	public String lendBookName;
	
}
