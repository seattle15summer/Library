/**
 * 
 */
package library.form;

import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Required;

/**
 * @author masayukitooyama
 *
 */
public class SearchBookForm {
	
	@Required
	public String searchText;

	@IntegerType
	public String page;
	
}
