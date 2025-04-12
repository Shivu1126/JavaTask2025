package assignment13.universitymanagement.courses;

import java.util.Scanner;

import assignment13.universitymanagement.MembersAuthorization;
import assignment13.universitymanagement.UniversityManagement;

public class AdminAuthorizatoin extends MembersAuthorization{

	@Override
	public void showMenu(String id) {
		Scanner scanner = UniversityManagement.getScanner();
		boolean loop = true;
		while(loop) {
			System.out.println("1. Add Faculty");
			System.out.println("2. Add Student");
			System.out.println("3. Remove Faculty");
			System.out.println("4. Remove Student");
			System.out.println("5. View Faculty Details");
			System.out.println("6. View Student Details");
			System.out.println("7. Add Course");
			System.out.println("8. Remove Course");
			System.out.println("9. View Curses Details");
			System.out.println("10. Edit profile");
			System.out.println("11. Logout");
			int opt = scanner.nextInt();
			switch(opt) {
				case 1:
					addFaculty();
					break;
				case 2:
					addStudent();
					break;
				case 3:
					System.out.println("Enter faculty id");
					String facId = scanner.next();
					removeFaculty(facId);
					break;
				case 4:
					System.out.println("Enter student id");
					String stuId = scanner.next();
					removeStudent(stuId);
					break;
				case 5:
					viewFacultyDetails();
					break;
				case 6:
					viewStudentDetails();
					break;
				case 7:
					addCourse();
					break;
				case 8:
					System.out.println("Enter course id");
					int courseId = scanner.nextInt();
					removeCourse(courseId);
					break;
				case 9:
					courseDetails(0);;
					break;
				case 10:
					editProfile(id);
					break;
				case 11:
					loop = false;
					break;
				default:
					System.out.println("Enter proper input");
			}
		}	
	}

	private void addFaculty() {
		
	}
	private void addStudent() {
		
	}
	private void removeFaculty(String id) {
		
	}
	private void removeStudent(String id) {
		
	}
	private void viewFacultyDetails() {
		
	}
	private void viewStudentDetails() {
		
	}
	
	private void addCourse() {
		
	}
	private void removeCourse(int courseId) {
		
	}
	
}
