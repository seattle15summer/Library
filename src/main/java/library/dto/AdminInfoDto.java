/**
 * 
 */
package library.dto;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;


/**
 * 管理者の情報を保持するDto
 * @author andoharuka
 */
@Component(instance = InstanceType.SESSION)
public class AdminInfoDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public AdminInfoDto(){}
	
	/** 管理者TBL.メールアドレス */
	public String mail;
	
	/** 管理者TBL.パスワード */
	public String password;
	
}
