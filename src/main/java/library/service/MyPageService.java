/**
 * 
 */
package library.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import library.dto.UserInfoDto;
import library.dto.UserViewDto;

import org.seasar.extension.jdbc.service.S2AbstractService;
import org.seasar.extension.jdbc.where.SimpleWhere;

import library.entity.User;
/**
 * @author nagaimidori
 *
 */
public class MyPageService extends S2AbstractService<User>{
		
	/**
	 * ユーザーの情報を取得するメソッド.
	 * @param mail ログインユーザーのメールアドレス
	 * @param password ログインユーザーのパスワード
	 * @return
	 */
	public User getUserbyUserInfo(String mail, String password) {
		
		//取得したユーザー情報を返します
		return select().where(new SimpleWhere().eq("mail", mail),new SimpleWhere().eq("password", password))
		.getSingleResult();
	}
	
	/**
	 * 取得したユーザー情報のDtoを作成するメソッド.
	 * @param user ユーザー情報を格納するエンティティ
	 * @param userViewDto ユーザー情報を格納するDto
	 */
	public void createUserViewDto(User user, UserViewDto userViewDto) {
		
		userViewDto.name = user.name;
		userViewDto.nameKana = user.nameKana;
		userViewDto.history = user.history;
		userViewDto.bookId = user.bookId;

	    userViewDto.status = setStatus(user.status);
	    //本を借りていない場合,「ー」を表示
	    if(user.borrowDay == null) {
	    	userViewDto.borrowDay = "ー";
	    } else {
	    	userViewDto.borrowDay = user.borrowDay;
	    }
	    
	    if(user.returnDay == null) {
	    	userViewDto.returnDay = "ー";
	    } else {
	    	userViewDto.returnDay = user.returnDay;
	    }
	   
	}
	
	/**
	 * ステータス(boolean)を表示用の内容に変換するメソッド.
	 * @param status DBからとってきたstatus
	 * @param strStatus 変換したstatus
	 */
	public String setStatus(boolean status) {
		
		String strStatus = null;
		
		//ステータスごとに表示する内容を変える
		if(status == true) {
			strStatus = "今本を借りています";
		} else if(status == false) {
			strStatus = "今本を借りていません";
		} else {
			//TODO
			//エラーハンドリング
		}
		return strStatus;
	}
	
	/**
	 * リマインドメッセージを返すメソッド.
	 * @param remindDay リマインド日
	 * @param remindMessage リマインドメッセージ
	 * @throws ParseException 
	 */
	public String getRemindMessage(String remindDay, String returnDay, boolean status) throws ParseException {

		String remindMessage = null;
		
        if(remindDay == null || returnDay == null) {
        	remindMessage = "";
        	return remindMessage;
        } else {
        	
        	// DBから取得した値をDate型に変換
            Date remindDate = DateFormat.getDateInstance().parse(remindDay);
            
            Date returnDate = DateFormat.getDateInstance().parse(returnDay);
            
            //今日の日付を取得
            Date today = new Date();
        
        	//リマインド日を超えているかつ本返してない
        	if(remindDate.compareTo(today) == -1 && status == true) {
        		remindMessage = "本の期限が迫っています";
        	} else if(returnDate.compareTo(today) == -1 && status == true) {
        		remindMessage = "本の締め切りが過ぎています";
        	} 
        
        	return remindMessage;
        }
	}
	
	public void userupdatePassword(User user,UserInfoDto userInfoDto, String password) {
		
		user.password = password;
		userInfoDto.password = password;
		update(user);
		
	}
	
	/**
	 * ユーザー情報を消去するメソッド.
	 * @param user 所虚したいユーザーのエンティティ
	 */
	public void deleteUser(User user) {
		
		delete(user);
		
	}
	
 }
	
