package assignment13.librarymanagement.repo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import assignment13.librarymanagement.model.Book;
import assignment13.librarymanagement.model.Transaction;
import assignment13.librarymanagement.model.User;

public class Database {
	private static Database db = null;
	HashMap<Integer, Book> books;
	HashMap<String, User> users;
	HashMap<String, List<Transaction>> transactions;
	private Database() {
		books = new HashMap<>();
		users = new HashMap<>();
		transactions = new HashMap<>();
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
	
	public HashMap<String, List<Transaction>> getTransactions() {
		return transactions;
	}
	public void setTransaction(String user, Transaction newTransaction) {
		List<Transaction> list = transactions.getOrDefault(user, new ArrayList<>());;
		list.add(newTransaction);
		this.transactions.put(user, list);
	}
}
