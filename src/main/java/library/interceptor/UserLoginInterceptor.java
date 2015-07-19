/**
 * 
 */
package library.interceptor;

import javax.annotation.Resource;

import org.aopalliance.intercept.MethodInvocation;
import org.seasar.framework.aop.interceptors.AbstractInterceptor;
import org.seasar.struts.annotation.Execute;

import library.dto.UserInfoDto;

/**
 * @author masayukitooyama
 *
 */
public class UserLoginInterceptor extends AbstractInterceptor {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * セッションに保持されているデータ
	 * 
	 */
	@Resource
	protected UserInfoDto userInfoDto;
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		//ここの条件がtrueならログイン成功
		//ここの条件がfalseなら未ログインでログインページへ移動

		return (!isExecuteMethod(invocation) || isLoggedIn()) ?
				invocation.proceed() : "/login?redirect=true" ;

	}

	private boolean isExecuteMethod(MethodInvocation invocation){
		return invocation.getMethod().isAnnotationPresent(Execute . class);
	}

	private boolean isLoggedIn() {
        // Sessionにユーザー情報が登録されているかチェック
        return (userInfoDto != null && userInfoDto .password != null);
    }
	
}
