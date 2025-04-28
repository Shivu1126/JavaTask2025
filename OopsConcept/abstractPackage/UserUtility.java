package abstractPackage;

public class UserUtility extends MemberUtility{

	@Override
	void showMenu(String id) {
		System.out.println("1. Borrow Book");
		System.out.println("2. Return Book");
		System.out.println("3. Show Transaction");
		System.out.println("4. Show all Books");	
		displayAllBooks();
		System.out.println("5. Edit profile");
		editProfile();
	}

}
