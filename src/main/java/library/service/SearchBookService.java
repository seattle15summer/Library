/**
 * 
 */
package library.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import library.dto.BookDto;
import library.entity.Bookinfo;

import org.seasar.extension.jdbc.service.S2AbstractService;

/**
 * @author masayukitooyama
 *
 */
public class SearchBookService extends S2AbstractService {
	
	/** 検索ワードに当てはまる本をデーターベースから取得する  */
	public BookDto searchBookInf(String searchText) {
		List<String> searchWordList = splitText(searchText);
		List<Bookinfo> searchResult = findBookInfoByWords(searchWordList);
		BookDto bookInfDto = createSearchDto(searchResult);
		return bookInfDto;
	}
	
	/**
	 * 検索ワードに引っ掛かるデータをSQLから取得する
	 * @param searchText
	 *            検索画面の入力値
	 * @return 検索結果のエンティティをリストコレクションに格納したもの
	 *
	 */
	private List<String> splitText(String searchText) {
		searchText = searchText.trim();
		searchText = searchText.replaceAll("　", " ");
		searchText = searchText.replaceAll(" {2}", "");
		String[] searchWords = searchText.split("\\s", 0);
		List<String> wordList = new ArrayList<>();
		for (String word : searchWords) {
			if (!(wordList.contains(word))) {
				wordList.add(word);
			}
		}
		return wordList;
	}
	
	/**
	 * 入力値のスペースを切り取り、入力値をリストに格納する
	 * @param searchText
	 * @return 入力値を格納したリスト
	 */
	private List<Bookinfo> findBookInfoByWords(List<String> searchWordList) {
		List<Bookinfo> searchResult = new ArrayList<>();
		Map<Integer, Bookinfo> mapResult = new HashMap<>();
		if (isSeachTextNotNull(searchWordList)) {
			for (String searchWord : searchWordList) {
				searchResult = jdbcManager.selectBySql(Bookinfo.class,
						"select * " + "from bookInfo " + "where "
								+ "title like '%' ? '%'", searchWord)
								.getResultList();
				for (Bookinfo result : searchResult) {
					mapResult.put(result.bookId, result);
				}
			}
		}

			List<Bookinfo> searchResults = new ArrayList<>(mapResult.values());

			return searchResults;
	}
	
	/**
	 * 渡された文字列が空文字の場合はnullを返す。そうでなければ渡された文字列をそのまま返す。
	 * @param searchWordList
	 * @return
	 */
	private boolean isSeachTextNotNull(List<String> searchWordList) {
		return (!(searchWordList.isEmpty())) ? true : false;
	}

	private BookDto createSearchDto(List<Bookinfo> searchResult) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 検索結果の件数とページを管理するメソッド
	 * @param searchText 検索ワード
	 * @param page ページ
	 * @return 検索件数
	 */
	public long countSearchResults(String searchText) {
		List<String> searchWordList = splitText(searchText);
		List<Bookinfo> searchResult = findBookInfoByWords(searchWordList);
		long countResult = searchResult.size();
		return countResult;
	}
	

}
