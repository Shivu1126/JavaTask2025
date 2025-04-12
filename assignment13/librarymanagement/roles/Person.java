package assignment13.librarymanagement.roles;

import java.util.HashMap;
import java.util.Scanner;

import assignment13.librarymanagement.LibraryManagement;
import assignment13.librarymanagement.model.Book;
import assignment13.librarymanagement.model.User;
import assignment13.librarymanagement.repo.Database;



public abstract class Person {
public abstract void showMenu(String id);
	
	public static Person getAuthorization(String userID)
	{
		if(userID.contains("Admin"))
		{
			return new Admin();
		}
		else
		{
			return new Customer();
		}
	}
	public void viewBooks()
	{
		Database dataBase = Database.getInstance();
		
		System.out.println("Book Details : ");
		HashMap<Integer, Book> books = dataBase.getBooks();
		for(Integer i :books.keySet())
		{
			System.out.println("Book ID : "+ books.get(i).getId());
			System.out.println("Book Name : "+ books.get(i).getTitle());
			System.out.println("Author Name : "+ books.get(i).getAuthor());
			System.out.println("Price : " + books.get(i).getPrice());
			System.out.println("ISBN Number : "+ books.get(i).getIsbnNum());
			System.out.println("       ---------------------         ");
		}
	}
	
	public void editOrAddUsers(String Id)
	{
		
		Scanner scan = LibraryManagement.getScanner();
		
		System.out.println("Enter name : ");
		String name = scan.nextLine();
		System.out.println("Enter Age : ");
		int age = scan.nextInt();
		if(age > 0 && age > 150)
		{
			System.out.println("Invalid Age..!");
			return;
		}
		scan.nextLine();
		System.out.println("Enter phone Number : ");
		String mobileNumber = scan.nextLine();
		System.out.println("Enter Email ");
		String email = scan.nextLine();
		System.out.println("Enter Password : ");
		String emailPassword = scan.nextLine();
		
		Database dataBase = Database.getInstance();
		dataBase.setUsers(Id, new User(Id, name, age, mobileNumber,email, emailPassword));
		System.out.println("Your User ID : "+(Id));	
	}
}
