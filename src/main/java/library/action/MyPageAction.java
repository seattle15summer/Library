/**
 * 
 */
package library.action;

import java.text.ParseException;

import javax.annotation.Resource;

import library.dto.UserInfoDto;
import library.dto.UserViewDto;
import library.entity.User;
import library.service.MyPageService;

import org.seasar.struts.annotation.Execute;

/**
 * @author nagaimidori
 *
 */
public class MyPageAction {
	
	@Resource
	MyPageService myPageService;
	
	@Resource
	UserViewDto userViewDto;
	
	@Resource 
	UserInfoDto userInfoDto;
	
	public String remindMessage;

	@Execute(validator = false)
	public String index() throws ParseException {
	
		User user = new User();
		
		//DBからユーザー情報を取得
		user  = myPageService.getUserbyUserInfo(userInfoDto.mail, userInfoDto.password);
		
		//取得したユーザー情報をもとに表示用のDtoを作成
		myPageService.createMyPageViewDto(user,userViewDto);
		
		remindMessage = 
				myPageService.getRemindMessage(userViewDto.registerDay,userViewDto.returnDay,user.status);
		
        return "index.jsp";
	}
	
}
