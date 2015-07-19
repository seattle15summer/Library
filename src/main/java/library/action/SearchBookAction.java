/**
 * 
 */
package library.action;

import javax.annotation.Resource;

import library.form.SearchBookForm;
import library.service.SearchBookService;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

/**
 * @author masayukitooyama
 *
 */
public class SearchBookAction {
	
	@ActionForm
	@Resource
	public SearchBookForm searchBookForm;
	
	@Resource
	public SearchBookService searchBookService;
	
	@Execute(validator = false)
	public String index(){
		return "index.jsp";
	}
	
	
	
}
