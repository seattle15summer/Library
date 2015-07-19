/**
 * 
 */
package library.service;

import java.util.ArrayList;
import java.util.List;

import library.dto.UserBookListViewDto;
import library.entity.Bookinfo;

import org.seasar.extension.jdbc.service.S2AbstractService;

/**
 * ユーザー 本の一覧表示サービスクラス
 * 
 * @author andoharuka
 */
public class UserBookListService extends S2AbstractService<Bookinfo> {

	public List<UserBookListViewDto> getAllBookDto() {

		/**
		 * データ型Bookinfo、リスト名に findAllメソッドですべてのエンティティを検索する。
		 */			
		List<Bookinfo> bookList = findAll();

		// TODO 命名ぐちゃぐちゃだから後で直す
		// リストを作る
		List<UserBookListViewDto> bookData = new ArrayList<UserBookListViewDto>();

		createDto(bookList, bookData);

		return bookData;
	}

	/**
	 * Dtoのリストに詰め替える。
	 */
	private void createDto(List<Bookinfo> bookList,
			List<UserBookListViewDto> bookData) {

		

		// bookListの中から１レコードずつ取り出してbookに詰める
		for (Bookinfo book : bookList) {
			
			UserBookListViewDto bookListDto = new UserBookListViewDto();
			
			bookListDto.title = book.title;
			bookListDto.author = book.author;
			bookListDto.category = book.category;
			bookListDto.price = book.price;
			bookListDto.publisher = book.publisher;
			bookData.add(bookListDto);

		}

	}
}
