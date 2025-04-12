package assignment13.universitymanagement;

import java.util.HashMap;
import java.util.Map;

import assignment13.universitymanagement.model.Course;
import assignment13.universitymanagement.model.Members;

public class Database {
	private static Database database;
	private Map<Integer, Course> courses;
	private Map<Integer, Members> members;
	private Database() {
		courses = new HashMap<>();
		members = new HashMap<>();
	}
	public static Database getInstance() {
		if(database==null)
			database  = new Database();
		return database;
	}
	
	public Map<Integer, Course> getCourses() {
		return courses;
	}
	public void setCourses(int id, Course course) {
		courses.put(id, course);
	}
	public Map<Integer, Members> getMembers() {
		return members;
	}
	public void setMembers(int id, Members member) {
		members.put(id, member);
	}
	
	
	
}
