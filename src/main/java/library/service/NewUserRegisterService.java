package library.service;

import library.dto.NewUserRegisterDto;
import library.entity.User;
import library.form.NewUserRegisterForm;

import org.seasar.extension.jdbc.service.S2AbstractService;

public class NewUserRegisterService extends S2AbstractService<User> {

	public NewUserRegisterForm newUserRegisterForm;

	public int insert(NewUserRegisterDto newUserRegisterDto) {
		User entity = new User();
		// entitiyがカプセル化してあってメンドイけど
		// カプセル化したままでいきます？
		return insert(entity);
	}
}