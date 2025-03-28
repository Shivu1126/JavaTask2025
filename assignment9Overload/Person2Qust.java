package assignment9Overload;
class Person{
	private String name;
	private int age;
	private String address;
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
}
public class Person2Qust {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Sivaram");
		System.out.println(p.toString());
		p = new Person("Sivaram",23);
		System.out.println(p.toString());
		p = new Person("Sivaram",23,"Avudaiyanoor");
		System.out.println(p.toString());
	}

}
