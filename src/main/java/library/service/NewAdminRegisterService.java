/**
 * 
 */
package library.service;

import library.dto.NewAdminRegisterDto;
import library.entity.Admin;
import library.form.NewAdminRegisterForm;

import org.seasar.extension.jdbc.service.S2AbstractService;

/**
 * 管理者登録用サービスクラス.
 * @author andoharuka
 */
public class NewAdminRegisterService  extends S2AbstractService<Admin> {

	public NewAdminRegisterForm newAdminRegisterForm;

	public int insert(NewAdminRegisterDto newAdminRegisterDto) {
		
		Admin entity = new Admin();
		
		entity.name     = newAdminRegisterDto.name;
		entity.nameKana = newAdminRegisterDto.nameKana;
		entity.password = newAdminRegisterDto.password;
		entity.mail     = newAdminRegisterDto.mail;
		
		return insert(entity);
	}

}
