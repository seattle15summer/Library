package library.service;

import org.seasar.extension.jdbc.service.S2AbstractService;
import org.seasar.extension.jdbc.where.SimpleWhere;

import library.entity.User;

public class UserLoginService extends S2AbstractService {

	public boolean isUserExist(String mail, String password) {
		UserInfoDto userInfoDto = getUserInfoDto(mail);
		return (mail.equals(userInfoDto.mail) && password.equals(userInfoDto.password));
		return false;
	}

	private UserInfoDto getUserInfoDto(String mail) {
		
		User userEntity = select().where(new SimpleWhere().eq("mail", mail)).getSingleResult();
		
		return null;
	}

}
