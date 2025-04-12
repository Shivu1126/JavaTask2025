package assignment13.librarymanagement.roles;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import assignment13.librarymanagement.LibraryManagement;
import assignment13.librarymanagement.model.Book;
import assignment13.librarymanagement.model.Transaction;
import assignment13.librarymanagement.repo.Database;
import assignment13.librarymanagement.transaction.Transactionable;

public class Customer extends Person implements Transactionable{
	private static int transactionId = 1;
	public void showMenu(String userId)
	{
		Scanner scan = LibraryManagement.getScanner();
		
		try
		{
			boolean run = true;
			while(run)
			{
				System.out.println("1.Show All Books \n2.Borrow Book \n3.Return Book \n4.Transaction History  \n5.Edit Profile \n6.Exit");
				
				int choice = scan.nextInt();
				switch(choice)
				{
				case 1:
					viewBooks();
					break;
				case 2:
					System.out.println("Enter book Id...");
					int borrowedBookId = scan.nextInt();
					borrowBook(userId, borrowedBookId);
					break;
				case 3:
					System.out.println("Enter book Id...");
					int returnBookId = scan.nextInt();
					returnBook(userId, returnBookId);
					break;
				case 4:
					viewTransactions(userId);
					break;
				case 5:
					editOrAddUsers(userId);
					System.out.println("SuceesFully Edited.");
					break;
				case 6 :
					run = false;
					System.out.println("Thank you for Use Library...");
					break;
				default : 
					System.out.println("Please Enter valid choice...");
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Enter proper input...!!!");
//			e.printStackTrace();
		}
	}

	@Override
	public void borrowBook(String user, int bookId) {
		Database database = Database.getInstance();
		database.setTransaction(user, new Transaction(transactionId++, bookId, user, getCurrentDateTime(), null));
		System.out.println("The book has been successfully borrowed. Kindly return it soon..");
	}

	@Override
	public void returnBook(String user, int bookId) {
		Database database = Database.getInstance();
		boolean isReturn = false;
		if(database.getTransactions().get(user)==null)
		{
			System.out.println("You didn't take any book yet...");
		}
		else {
			for(Transaction transaction : database.getTransactions().get(user)) {
				if(transaction.getBookId()==bookId && transaction.getReturnDate()==null) {
					transaction.setReturnDate(getCurrentDateTime());
					isReturn = true;
					System.out.println("Book returned successfully...");
					break;
				}
			}
			if(!isReturn)
				System.out.println("Book not found..!");
		}
	}

	@Override
	public void viewTransactions(String userId) {
		Database database = Database.getInstance();
		List<Transaction> transactionList = database.getTransactions().get(userId);
		if(transactionList==null || transactionList.size()==0)
			System.out.println("Transaction Empty...!!!");
		else {
			System.out.println("Tran.Id\t\tBook\t\tAuthor\t\tAssignDate\t\tReturnDate");
			System.out.println("-------------------------------------------------------------------------------------------");
			for(Transaction transaction : transactionList) {
				Book book = database.getBooks().get(transaction.getBookId());
				System.out.print(transaction.getTranscantionId()+"\t");
				System.out.print(book.getTitle()+"\t");
				System.out.print(book.getAuthor()+"\t");
				System.out.print(transaction.getAssignDate()+"\t");
				System.out.print(transaction.getReturnDate()==null?"Unreturned":transaction.getReturnDate()+"\t");
				System.out.println();
			}
			System.out.println("-------------------------------------------------------------------------------------------");
			
		}
	}
	
	public String getCurrentDateTime() {
		LocalDateTime currentDateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return currentDateTime.format(formatter);
	}
}
