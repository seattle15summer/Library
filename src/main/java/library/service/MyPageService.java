/**
 * 
 */
package library.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
		return select().where(new SimpleWhere().eq("mail", mail).eq("password", password))
		.getSingleResult();
	}
	
	/**
	 * 取得したユーザー情報のDtoを作成するメソッド.
	 * @param user ユーザー情報を格納するエンティティ
	 * @param userViewDto ユーザー情報を格納するDto
	 */
	public void createMyPageViewDto(User user, UserViewDto userViewDto) {
		
		userViewDto.name = user.name;
		userViewDto.nameKana = user.nameKana;
		userViewDto.borrowDay = user.borrowDay;
		userViewDto.returnDay = user.returnDay;
		userViewDto.history = user.history;
		userViewDto.bookId = user.bookId;
	    userViewDto.status = setStatus(user.status);
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
			strStatus = "本を借りている";
		} else if(status == false) {
			strStatus = "本を借りていない";
		} else {
			//TODO
			//エラーハンドリング
		}
		return strStatus;
	}
	
	/**
	 * 
	 * @param remindDay
	 * @param remindMessage
	 * @throws ParseException 
	 */
	public String getRemindMessage(String remindDay, String returnDay, boolean status) throws ParseException {

		String remindMessage = null;
		
        // DBから取得した値をDate型に変換
        Date remindDate = DateFormat.getDateInstance().parse(remindDay);
        
        Date returnDate = DateFormat.getDateInstance().parse(returnDay);
        
        //今日の日付を取得
        Date today = new Date();
        
        //リマインド日近いかつ本返してない
        if(remindDate.compareTo(today) == -1 && status == true) {
        	remindMessage = "本の期限が迫っています";
        } else if(returnDate.compareTo(today) == -1 && status == true) {
        	remindMessage = "本の締め切りが過ぎています";
        } 
        
        return remindMessage;
	}
}
	
