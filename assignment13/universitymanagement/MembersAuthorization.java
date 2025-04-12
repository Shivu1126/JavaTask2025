package assignment13.universitymanagement;

public abstract class MembersAuthorization {
	public abstract void showMenu(String id);
	
	public static MembersAuthorization getAuthorization(String userId) {
		return null;
	}
	public void courseDetails(int id) {
		if(id==0) {
			//show all courses (call from admin)
		}
		else {
			//show student's or faculty's course
		}
	}
	public void editProfile(String id) {
		//edit their profile
	}
}
