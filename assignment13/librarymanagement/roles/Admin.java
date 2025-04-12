package assignment13.librarymanagement.roles;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import assignment13.librarymanagement.LibraryManagement;
import assignment13.librarymanagement.model.Book;
import assignment13.librarymanagement.repo.Database;
import assignment13.librarymanagement.model.Transaction;
import assignment13.librarymanagement.model.User;

public class Admin extends Person{
	private static int generateAdminID = 1;
	private static int bookID = 5;
	public void showMenu(String userID)
	{
		Scanner scan =  LibraryManagement.getScanner();
		
		try
		{
			boolean run = true;
			Database database = Database.getInstance();
			while(run)
			{
				System.out.println("1.Add Books \n2.Remove Books \n3.Add Admin \n4.All Transaction \n5.Logout");
				int choice = scan.nextInt();
				scan.nextLine();
				switch(choice)
				{
				case 1:
					System.out.println("Enter Title : ");
					String title = scan.nextLine();
					System.out.println("Enter Author name : ");
					String AuthorName = scan.nextLine();
					System.out.println("Enter Price : ");
					double price = scan.nextDouble();
					scan.nextLine();
					System.out.println("Enter ISBN Number : ");
					String isbnNumber = scan.nextLine();
					
					database.setBooks(bookID, new Book(bookID++ +"", title, AuthorName, price, isbnNumber));
					
					System.out.println("Book Added Successfully.");
					break;
					
				case 2:
					System.out.println("Enter Book Id : ");
					int bookId = scan.nextInt();
					
					database.getBooks().remove(bookId);
					
					System.out.println("Book Removes Successful.");
					break;
					
				case 3:
					
					editOrAddUsers("Admin"+ generateAdminID++);
					break;
				case 4:
					if(database.getTransactions().isEmpty())
						System.out.println("No Transaction Yet..");
					else
						showAllTransaction(database.getTransactions(), database);
				case 5:
					run = false;
					System.out.println("Logout successfully");
					break;
					
				default : 
					System.out.println("Please Enter valid choice.");
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void showAllTransaction(Map<String, List<Transaction>> transactions, Database database) {
		
		System.out.println("UserId\t\tUserName\t\tBookName\t\tAuthor\t\tAssignDate\t\tReturnDate");
		System.out.println("-------------------------------------------------------------------------------");
		for(String userId : transactions.keySet()) {
			User user = database.getUsers().get(userId);
			List<Transaction> transactionList = database.getTransactions().get(userId);
			for(Transaction transaction : transactionList) {
				Book book = database.getBooks().get(transaction.getBookId());
				System.out.print(userId+"\t");
				System.out.print(user.getName()+"\t");
				System.out.print(book.getTitle()+"\t");
				System.out.print(book.getAuthor()+"\t");
				System.out.print(transaction.getAssignDate()+"\t");
				System.out.print(transaction.getReturnDate()+"\t");
				System.out.println();
			}
		}
		System.out.println("-------------------------------------------------------------------------------");
		
	}
}
