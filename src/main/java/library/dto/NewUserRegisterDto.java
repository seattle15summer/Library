package library.dto;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;

@Component(instance = InstanceType.SESSION)
public class NewUserRegisterDto implements Serializable {

	private static final long serialVersionUID = 1L;

	public NewUserRegisterDto(){}

	/** 名前 漢字 */
	public String name;

	/** 名前 フリガナ */
	public String nameKana;

	/** パスワード */
	public String password;

	/** メール */
	public String mail;


}
