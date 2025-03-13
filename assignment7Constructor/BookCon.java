package assignment7Constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book{
	private int id;
	private String bookName;
	private String authorName;
	private String genre;
	private int price;
	private String publishDate;
	private int pageCount;
	
	public Book(int id, String bookName, String authorName, String genre, int price, String publishDate, int pageCount)
	{
		this.id = id;
		this.bookName = bookName;
		this.authorName = authorName;
		this.genre = genre;
		this.price = price;
		this.publishDate = publishDate;
		this.pageCount = pageCount;
	}
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

public class BookCon {
	static Scanner scanner = new Scanner(System.in);
	static List<Book> bookList = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookCon bookCon = new BookCon();
		int option = 0;
		
		do{
			System.out.println("1. Add Book");
			System.out.println("2. Display");
			System.out.println("3. Exit");
			option = scanner.nextInt();
			if(option==1) {
				bookCon.addBook();
			}
			else if(option==2) {
				if(bookList.isEmpty())
					System.out.println("Empty List..");
				else {
					for(Book book : bookList)
						System.out.println(book.toString());
				}
			}
				
			
			
		}while(option!=3);
	}
	public void addBook() {
		System.out.println("Enter id");
		int id = scanner.nextInt();
		System.out.println("Enter book Name");
		scanner.nextLine();
		String bookName = scanner.nextLine();
		System.out.println("Enter author name");
		String authorName = scanner.next();
		System.out.println("Enter genre ");
		String genre = scanner.next();
		System.out.println("Enter price");
		int price = scanner.nextInt();
		System.out.println("Enter publish date");
		String publishDate = scanner.next();
		System.out.println("Enter page count");
		int pageCount = scanner.nextInt();
		
		bookList.add(new Book(id, bookName, authorName, genre, price, publishDate, pageCount));
	}

}
