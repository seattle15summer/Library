/**
 * 
 */
package library.service;

import org.seasar.extension.jdbc.service.S2AbstractService;
import org.seasar.extension.jdbc.where.SimpleWhere;

import library.dto.BookDto;
import library.entity.Bookinfo;

/**
 * @author nagaimidori
 *
 */
public class BookService extends S2AbstractService<Bookinfo>{
	
	public Bookinfo getBookInfoById(Integer bookId) {
		
		//取得した本の情報を返します
		return select().where(new SimpleWhere().eq("bookId", bookId))
		.getSingleResult();
	}
	
	public void createBookDto(Bookinfo bookInfo, BookDto bookDto) {
		
		bookDto.title = bookInfo.title;
		bookDto.author = bookInfo.author;
		bookDto.category = bookInfo.category;
		bookDto.publisher = bookInfo.publisher;

	}

}
