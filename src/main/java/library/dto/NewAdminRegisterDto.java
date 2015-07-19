/**
 * 
 */
package library.dto;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;

/**
 * 管理者新規登録用Dto
 * @author andoharuka
 */
@Component(instance = InstanceType.SESSION)
public class NewAdminRegisterDto implements Serializable{

	private static final long serialVersionUID = 1L;

	public NewAdminRegisterDto(){}

	/** 名前 漢字 */
	public String name;

	/** 名前 フリガナ */
	public String nameKana;

	/** パスワード */
	public String password;

	/** メール */
	public String mail;


	
}
