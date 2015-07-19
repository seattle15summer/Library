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
import library.service.MyPageService;
import library.service.BookService;

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
	

	@Execute(validator = false)
	public String index() throws ParseException {
	
		User user = new User();
		
		Bookinfo bookInfo = new Bookinfo();
		
		//まだログインできてないからテスト用に
		//TODO:テスト終わったら外す
		userInfoDto.mail = "aaa@gmail.com";
		userInfoDto.password = "11111111";
		
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
		
		bookService.createBookDto(bookInfo, bookDto);
		
		}
		
        return "index.jsp";
	}
	
}
