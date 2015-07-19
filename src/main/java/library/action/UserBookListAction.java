/**
 * 
 */
package library.action;

import java.util.List;

import javax.annotation.Resource;

import library.dto.UserBookListViewDto;
import library.service.UserBookListService;

import org.seasar.struts.annotation.Execute;

/**
 * ユーザー用 本の一覧表示用アクションクラス.
 * @author andoharuka
 */
public class UserBookListAction {
	
	public List<UserBookListViewDto> userBookListViewDto;
	
	@Resource
	protected UserBookListService userBookListService;

	/**
	 * DBから一覧を取得し、一覧画面に遷移するメソッド.
	 * @return 本の一覧画面
	 */
	@Execute(validator = false)
	public String index() {
		
		// DTOに入った一覧の呼び出し
		userBookListViewDto = userBookListService.getAllBookDto();
		
		return "index.jsp";
	}

}
