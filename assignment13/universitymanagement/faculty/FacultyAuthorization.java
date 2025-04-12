package assignment13.universitymanagement.faculty;

import java.util.Scanner;

import assignment13.universitymanagement.MembersAuthorization;
import assignment13.universitymanagement.UniversityManagement;

public class FacultyAuthorization extends MembersAuthorization{

	@Override
	public void showMenu(String id) {
		Scanner scanner = UniversityManagement.getScanner();
		boolean loop = true;
		while(loop) {
			System.out.println("1. View Student Details");
			System.out.println("2. Leave Approval");
			System.out.println("3. View Leave Details");
			System.out.println("4. View Curses Details");
			System.out.println("5. Edit profile");
			System.out.println("6. Logout");
			int opt = scanner.nextInt();
			switch(opt) {
				case 1:
					viewStudentDetail();
					break;
				case 2:
					leaveApproval();
					break;
				case 3:
					viewLeaveHistory();
					break;
				case 4:
					int courseId = 0;//getCourseId();	//get course id using their detail
					courseDetails(courseId);
					break;
				case 5:
					editProfile(id);
					break;
				case 6:
					loop = false;
					break;
				default:
					System.out.println("Enter proper input");
			}
		}	
	}
	private void viewStudentDetail() {
		//view all student details
	}
	private void leaveApproval() {
		// leave management for student (accept or reject)
	}

	private void viewLeaveHistory() {
		// show all student leave history
	}

}
