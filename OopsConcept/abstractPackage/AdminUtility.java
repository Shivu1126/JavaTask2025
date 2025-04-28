package abstractPackage;

public class AdminUtility extends MemberUtility{

	@Override
	void showMenu(String id) {
		System.out.println("1. Add User");
		System.out.println("2. Remove User");
		System.out.println("3. Add Book");
		System.out.println("4. Remove Book");
		System.out.println("5. Show all books");
		displayAllBooks();// call parent class method
		System.out.println("6. Edit Profile");		
		editProfile();// call parent class method
	}

}
