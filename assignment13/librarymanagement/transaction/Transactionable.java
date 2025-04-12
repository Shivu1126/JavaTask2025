package assignment13.librarymanagement.transaction;

public interface Transactionable {
	void borrowBook(String user, int bookId);
	void returnBook(String user, int bookId);
	void viewTransactions(String user);
}
