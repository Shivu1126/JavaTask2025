package assignment13.librarymanagement.model;

public class Book {
	private String isbnNum;
	private String id;
	private String title;
	private String author;
	private double price;
	
	public Book( String id, String title, String author, double price, String isbnNum) {
		this.isbnNum = isbnNum;
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String getIsbnNum() {
		return isbnNum;
	}
	public void setIsbnNum(String isbnNum) {
		this.isbnNum = isbnNum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
