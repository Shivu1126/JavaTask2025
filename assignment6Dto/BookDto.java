package assignment6Dto;

class Book{
	private int id;
	private String bookName;
	private String authorName;
	private String genre;
	private int price;
	private String publishDate;
	private int pageCount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", authorName=" + authorName + ", genre=" + genre
				+ ", price=" + price + ", publishDate=" + publishDate + ", pageCount=" + pageCount + "]";
	}
	
}


public class BookDto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
		book.setId(18);
		book.setBookName("What a cover drive!!");
		book.setAuthorName("Sivaram");
		book.setGenre("Sports");
		book.setPrice(269);
		book.setPublishDate("05-11-2030");
		book.setPageCount(183);
		
		System.out.println(book.toString());
	}
}
