package assignment8Inheritance.libraryManagementSystem;

import java.util.Scanner;

public class Admin extends Person {
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
				System.out.println("1.Add Books \n2.Remove Books \n3.Add Admin \n4.Exit");
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
					run = false;
					System.out.println("Bye... Bye...");
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
}
