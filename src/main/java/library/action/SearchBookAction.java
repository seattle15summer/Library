/**
 * 
 */
package library.action;

import javax.annotation.Resource;

import library.constant.BookStatusConstant;
import library.dto.BookDto;
import library.form.SearchBookForm;
import library.service.SearchBookService;

import org.seasar.framework.util.IntegerConversionUtil;
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
	
	//総件数
	public long total;
	
	public boolean hasNext;
	
	public boolean hasPrev;
	
	@Execute(validator = false)
	public String index(){
		return "index.jsp";
	}
	
	/** 検索 */
	@Execute(validator = false)
	public String searchBookInf(){
		
		int page = IntegerConversionUtil.toPrimitiveInt(this.searchBookForm.page);
		
		//総件数を取得
		total = searchBookService.countSearchResults(searchBookForm.searchText);
		
		if(page != 0){
			hasPrev = true;
		}

		if((page + 1) * BookStatusConstant.LIMIT < total){
		   hasNext = true;
		}
				
		BookDto bookDto = searchBookService.searchBookInf(searchBookForm.searchText);
		return "";
	}
	
}
