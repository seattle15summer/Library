/**
 * 
 */
package library.service;

import javax.annotation.Resource;

import library.dto.AdminViewDto;
import library.entity.Admin;

import org.seasar.extension.jdbc.service.S2AbstractService;
import org.seasar.extension.jdbc.where.SimpleWhere;

/**
 * 管理者情報表示用サービスクラス.
 * 
 * @author andoharuka
 */
public class ShowAdminInfoService extends S2AbstractService<Admin> {

	@Resource
	public AdminViewDto adminViewDto;

	public AdminViewDto getAdminInfo(String mail) {

		// メールアドレスをキーにして１レコード取得する
		Admin adminData = select().where(new SimpleWhere().eq("mail", mail))
				.getSingleResult();

		AdminViewDto adminViewDto = createAdminViewDto(adminData);

		return adminViewDto;
	}

	/** 　ユーザー情報を格納 */
	private AdminViewDto createAdminViewDto(Admin adminData) {
		AdminViewDto adminViewDto = new AdminViewDto();

		adminViewDto.name = adminData.name;
		adminViewDto.nameKana = adminData.nameKana;
		adminViewDto.mail = adminData.mail;

		return adminViewDto;
	}

}
