package assignment13.universitymanagement.students;

import java.util.Scanner;

import assignment13.universitymanagement.MembersAuthorization;
import assignment13.universitymanagement.UniversityManagement;

public class StudentAuthorization extends MembersAuthorization{

	@Override
	public void showMenu(String id) {
		Scanner scanner = UniversityManagement.getScanner();
		boolean loop = true;
		while(loop) {
			System.out.println("1. View Curses Details");
			System.out.println("2. Edit profile");
			System.out.println("3. View Leave Details");
			System.out.println("4. Request For Leave");
			System.out.println("5. Logout");
			int opt = scanner.nextInt();
			switch(opt) {
				case 1:
					int courseId = 0;//getCourseId();	//get course id using their detail
					courseDetails(courseId);
					break;
				case 2:
					editProfile(id);
					break;
				case 3:
					viewLeaveHistory(id);
					break;
				case 4:
					reqForLeave();
					break;
				case 6:
					loop = false;
					break;
				default:
					System.out.println("Enter proper input");
			}
		}
	}

	private void viewLeaveHistory(String id) {
		// view their leave history
		
	}

	private void reqForLeave() {
		// apply for the leave
		
	}
	
}
