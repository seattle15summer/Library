/**
 * 
 */
package library.action;

import java.text.ParseException;

import javax.annotation.Resource;

import library.dto.BookDto;
import library.dto.UserInfoDto;
import library.dto.UserViewDto;
import library.entity.Bookinfo;
import library.entity.User;
import library.form.UserInfoForm;
import library.service.MyPageService;
import library.service.BookService;

import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

/**
 * @author nagaimidori
 *
 */
public class MyPageAction {
	
	@Resource
	public MyPageService myPageService;
	
	@Resource
	public BookService bookService;
	
	@Resource
	public UserViewDto userViewDto;
	
	@Resource 
	public BookDto bookDto;
	
	@Resource 
	public UserInfoDto userInfoDto;
	
	@ActionForm
	public UserInfoForm userInfoForm;
	
	public String errorMessage;

	@Execute(validator = false)
	public String index() throws ParseException {
	
		User user = new User();
		
		Bookinfo bookInfo = new Bookinfo();
		
		//DBからユーザー情報を取得
		user  = myPageService.getUserbyUserInfo(userInfoDto.mail, userInfoDto.password);
		
		//取得したユーザー情報をもとに表示用のDtoを作成
		myPageService.createUserViewDto(user,userViewDto);
		
		//リマインドメッセージを取得
		userViewDto.remindMessage = 
				myPageService.getRemindMessage(userViewDto.registerDay,userViewDto.returnDay,user.status);
		
		if(user.bookId != null) {
		
		//借りている本を取得する
		bookInfo = bookService.getBookInfoById(user.bookId);
		
		//取得した本の情報からDtoを作成
		bookService.createBookDto(bookInfo, bookDto);
		
		}
        return "index.jsp";
	}
	
	/**
	 * パスワード変更メソッド.
	 * @return
	 */
	@Execute(validator = false)
	public String updatePassword() {
	
		return "passwordUpdate.jsp";
	}

	/**
	 * パスワード変更前確認メソッド.
	 * @return
	 */
	@Execute(validator = false)
	public String registerPassword() {
		
		if(userInfoForm.currentPassword.equals(userInfoDto.password) 
				&& userInfoForm.currentPassword.equals(userInfoForm.currentConfirmPassword)){
			
			User user = new User();
			
			//現在ログインしているユーザー情報をエンティティに格納
			user  = myPageService.getUserbyUserInfo(userInfoDto.mail, userInfoDto.password);
			
			myPageService.userupdatePassword(user,userInfoDto,userInfoForm.newPassword);
			
			return "passwordUpdateComplete.jsp";
			
		} else if(!userInfoForm.currentPassword.equals(userInfoDto.password)){
			errorMessage = "現在のパスワードが違います";
			return "passwordUpdate.jsp";
		} else if(!userInfoForm.currentPassword.equals(userInfoForm.currentConfirmPassword)) {
			errorMessage = "確認用のパスワードが一致しません";
			return "passwordUpdate.jsp";
		} else {
			return "passwordUpdate.jsp";
		}
		
	}
	
	
	/**
	 * ユーザー情報消去確認メソッド.
	 * @return
	 */
	@Execute(validator = false)
	public String deleteConfirm() {
		
		return "deleteConfirm.jsp";
	}
	
	/**
	 * ユーザー情報消去完了メソッド.
	 * @return
	 */
	@RemoveSession(name = "UserInfoDto")
	@Execute(validator = false)
	public String deleteUser() {
		
		User user = new User();
		
		//現在ログインしているユーザー情報をエンティティに格納
		user  = myPageService.getUserbyUserInfo(userInfoDto.mail, userInfoDto.password);
		
		//ユーザー情報消去メソッドを追加
		myPageService.deleteUser(user);
		
		return "deleteComplete.jsp";
	}
}
