/**
 * 
 */
package library.service;

import library.dto.AdminInfoDto;
import library.entity.Admin;

import org.seasar.extension.jdbc.service.S2AbstractService;
import org.seasar.extension.jdbc.where.SimpleWhere;

/**
 * 管理ログイン用サービスクラス.
 * @author andoharuka
 */
public class AdminLoginService extends S2AbstractService<Admin>{
	
	/** 管理者の有無判定 */
	public boolean isAdminExist(String mail, String password) {
		AdminInfoDto adminInfoDto = getAdminInfoDto(mail);
		return (mail.equals(adminInfoDto.mail) && password.equals(adminInfoDto.password));
	}
	/** db から管理者情報を取得する */
	private AdminInfoDto getAdminInfoDto(String mail) {
		
		Admin adminEntity = select().where(new SimpleWhere().eq("mail", mail)).getSingleResult();
		
		AdminInfoDto adminInfoDto = createAdminInfoDto(adminEntity);
		
		return adminInfoDto;
	}
	/**　ユーザー情報を記録 */
	private AdminInfoDto createAdminInfoDto(Admin adminEntity) {
		AdminInfoDto adminInfoDto = new AdminInfoDto();
		adminInfoDto.mail = adminEntity.mail;
		adminInfoDto.password = adminEntity.password;
		return adminInfoDto;
	}

}
