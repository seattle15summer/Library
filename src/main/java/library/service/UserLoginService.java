package library.service;

import org.seasar.extension.jdbc.service.S2AbstractService;
import org.seasar.extension.jdbc.where.SimpleWhere;

import library.dto.UserInfoDto;
import library.entity.User;

public class UserLoginService extends S2AbstractService<User> {
	
	
	
	/** ユーザーの有無判定 */
	public boolean isUserExist(String mail, String password) {
		UserInfoDto userInfoDto = getUserInfoDto(mail, password);
		return (mail.equals(userInfoDto.mail) && password.equals(userInfoDto.password));
	}
	
	/** db からユーザーを取得する */
	private UserInfoDto getUserInfoDto(String mail, String password) {
		
		User userEntity = select().where(new SimpleWhere().eq("mail", mail), new SimpleWhere().eq("password", password)).getSingleResult();
		if (userEntity == null){
			UserInfoDto illegalUserDto = new UserInfoDto();
			illegalUserDto.mail = "illegal";
			illegalUserDto.password = "illegal";
			return illegalUserDto;
		}
		UserInfoDto userInfoDto = createUserInfoDto(userEntity);
		
		return userInfoDto;
	}
	/**　ユーザー情報を格納	 */
	private UserInfoDto createUserInfoDto(User userEntity) {
		UserInfoDto userInfoDto = new UserInfoDto();
		userInfoDto.mail = userEntity.mail;
		userInfoDto.password = userEntity.password;
		return userInfoDto;
	}

}
