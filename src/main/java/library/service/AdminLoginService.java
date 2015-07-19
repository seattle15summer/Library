/**
 * 
 */
package library.service;

import library.dto.AdminInfoDto;
import library.entity.Admin;

import org.seasar.extension.jdbc.service.S2AbstractService;
import org.seasar.extension.jdbc.where.SimpleWhere;

/**
 * 管理者ログイン用サービスクラス.
 * @author andoharuka
 */
public class AdminLoginService extends S2AbstractService<Admin>{
	
	/** ユーザーの有無判定 */
	public boolean isAdminExist(String mail, String password) {
		AdminInfoDto adminInfoDto = getAdminInfoDto(mail);
		return (mail.equals(adminInfoDto.mail) && password.equals(adminInfoDto.password));
	}
	
	/** db からユーザーを取得する */
	private AdminInfoDto getAdminInfoDto(String mail) {
		
		Admin adminEntity = select().where(new SimpleWhere().eq("mail", mail)).getSingleResult();
		if (adminEntity == null){
			AdminInfoDto illegalAdminDto = new AdminInfoDto();
			illegalAdminDto.mail = "illegal";
			illegalAdminDto.password = "illegal";
			return illegalAdminDto;
		}
		AdminInfoDto adminInfoDto = createAdminInfoDto(adminEntity);
		
		return adminInfoDto;
	}
	/**　ユーザー情報を格納	 */
	private AdminInfoDto createAdminInfoDto(Admin adminEntity) {
		AdminInfoDto adminInfoDto = new AdminInfoDto();
		adminInfoDto.mail = adminEntity.mail;
		adminInfoDto.password = adminEntity.password;
		return adminInfoDto;
	}

}
