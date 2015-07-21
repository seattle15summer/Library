/**
 * 
 */
package library.dto;

/**
 * ユーザー 本の一覧表示用DTO
 * @author andoharuka
 */
public class UserBookListViewDto {

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
