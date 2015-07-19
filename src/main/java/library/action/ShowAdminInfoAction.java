/**
 * 
 */
package library.action;

import javax.annotation.Resource;

import library.dto.AdminInfoDto;
import library.dto.AdminViewDto;
import library.service.ShowAdminInfoService;

import org.seasar.struts.annotation.Execute;

/**
 * 管理者情報表示用アクションクラス.
 * 
 * @author andoharuka
 */
public class ShowAdminInfoAction {

	@Resource
	protected AdminInfoDto adminInfoDto;

	public AdminViewDto adminViewDto;

	@Resource
	public ShowAdminInfoService showAdminInfoService;

	/**
	 * ログインのセッション情報から管理者の情報を取得し、管理者トップページを表示する
	 * 
	 * @return 管理者トップページ
	 */
	@Execute(validator = false)
	public String index() {
		
		// メールアドレスから管理者の情報を取得し、表示する
		adminViewDto = showAdminInfoService.getAdminInfo(adminInfoDto.mail);

		return "index.jsp";

	}
}
