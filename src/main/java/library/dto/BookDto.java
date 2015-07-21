/**
 * 
 */
package library.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nagaimidori
 *
 */
public class BookDto {
	
	public BookDto(Integer bookId, String title, String author,
			String category, String publisher, Integer storage, Boolean status) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.category = category;
		this.publisher = publisher;
		this.storage = storage;
		this.status = status;
	}

	public BookDto() {
	}
	
	public List<BookDto> bookInfoDtos = new ArrayList<>();
	/** 本のID */
	public Integer bookId;

	/** タイトル */
	public String title;
	
	/** 作者 */
	public String author;

	/** カテゴリー */
	public String category;
	
	/** 出版社 */
	public String publisher;

	/** 値段 */
	public Integer price;

	/** 表紙 */
	public String coverimg;
	
	/** ステータス */
	public Boolean status;

	/** */
	public Integer storage;

}
