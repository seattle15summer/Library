/**
 * 
 */
package library.action;

import org.seasar.struts.annotation.Execute;

/**
 * @author masayukitooyama
 *
 */
public class ShowBookList {
	
	@Execute(validator = false)
	public String index(){
		return "bookList.jsp";
	}
	
}
