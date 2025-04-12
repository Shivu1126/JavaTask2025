package assignment13.librarymanagement;

import java.util.Scanner;

import assignment13.librarymanagement.model.Book;
import assignment13.librarymanagement.model.User;
import assignment13.librarymanagement.repo.Database;
import assignment13.librarymanagement.roles.Customer;
import assignment13.librarymanagement.roles.Person;


public class LibraryManagement {
	private static Scanner scan;
	private static int bookID = 1;
	private static final String ADMIN_ID = "Admin_@#11";
	private static final String PASSWORD = "AdmIn!@11*";
	private static long generateUserID = 100;
	public static void main(String[] args) {
		Database dataBase = Database.getInstance();
		
		dataBase.setUsers(ADMIN_ID, new User( ADMIN_ID,"Default_ID", 0,"", "", PASSWORD));
		
		dataBase.setBooks(bookID, new Book(bookID++ +"", "Biopic: KING KOHLI","Shiv", 100, "12345"));
		dataBase.setBooks(bookID, new Book(bookID++ +"", "Master Your Mindset","Ravi Saroj", 230, "12376545"));
		dataBase.setBooks(bookID, new Book(bookID++ +"", "Intha Book Vangathinga!","Gopinath", 150, "7646345"));
		dataBase.setBooks(bookID, new Book(bookID++ +"", "Psychology Of Money","Morgan Housel", 200, "343434"));
		scan = getScanner();
		boolean loop = true;
		
		while(loop)
		{
			System.out.println("1.Login \n2.Register \n3.Exit");
			
			int choice = scan.nextInt();
			scan.nextLine();
			switch(choice)
			{
			case 1 :
				System.out.println("Enter User ID : ");
				String userID = scan.nextLine();
				System.out.println("Enter Password : ");
				String password = scan.nextLine();
				
				if(!dataBase.getUsers().containsKey(userID))
				{
					System.out.println("Invalid UserID or Password..");
				}
				else if(!dataBase.getUsers().get(userID+"").getPassword().equals(password))
				{
					System.out.println("Invalid UserID or Password...!");
				}
				else {
					System.out.println("Welcome");
						
					Person person = Person.getAuthorization(userID);
					
					person.showMenu(userID+"");
				}
				break;
					
			case 2 :
				Person customer = new Customer();
				customer.editOrAddUsers("User" + generateUserID++);
				break;
			case 3:
				loop = false;
				System.out.println("Thankyou for Visiting.");
				break;
					
			default :
				System.out.println("Please Enter valid Choice...");
			}
		}
	}

	public static Scanner getScanner() {
		if(scan==null)
			scan = new Scanner(System.in);
		return scan;
	}

}
