package assignment8Inheritance;

class Student{
	private int id;
	private String name;
	private String degree;
	Student(int id, String name, String degree){
		this.id = id;
		this.name = name;
		this.degree = degree;
	}
	public void display() {
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Degree: "+degree);
	}
}
class ZSGSStudent extends Student{
	private boolean hasLaptop = true;
	private boolean isPmiStudent;
	ZSGSStudent(int id, String name, String degree, boolean hasLaptop, boolean isPmiStudent){
		super(id, name, degree);
		this.hasLaptop = hasLaptop;
		this.isPmiStudent = isPmiStudent;
	}
	public void display() {
		super.display();
		System.out.println("Has Laptop : "+(hasLaptop?"Yes":"No"));
		System.out.println("PMI Student: "+(isPmiStudent?"Yes":"No"));
	}
	
}
public class Student2qust {

	public static void main(String[] args) {
		Student stu = new ZSGSStudent(11,"Shiv","Engineer",false,true);
		stu.display();
	}

}
