package assignment8Inheritance.libraryManagementSystem;

import java.util.HashMap;

public class Database {
	private static Database db = null;
	HashMap<Integer, Book> books;
	HashMap<String, User> users;
	private Database() {
		books = new HashMap<>();
		users = new HashMap<>();
	}
	public static Database getInstance() {
		if(db == null)
			db = new Database();
		return db;
	}
	
	public HashMap<Integer, Book> getBooks() {
		return books;
	}
	public void setBooks(int id, Book book) {
		this.books.put(id, book);
	}
	
	public HashMap<String, User> getUsers() {
		return users;
	}
	public void setUsers(String userID, User user) {
		this.users.put(userID, user);
	}
}
