/**
 * 
 */
package library.action;

import org.seasar.struts.annotation.Execute;

/**
 * @author masayukitooyama
 *
 */
public class SearchBookAction {
	
	@Execute(validator = false)
	public String indexx(){
		return "index.jsp";
	}
	
}
