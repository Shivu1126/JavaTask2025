package thisAndSuper;
//Encapsulation
public class SuperClass {
	private String name;
	private int age;
	SuperClass(String name, int age){
		System.out.println("Super class constructor called..");
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
}
