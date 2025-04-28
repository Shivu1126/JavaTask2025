package inheritance;

public class ChildClass extends ParentClass{
	public void methodCall() {
		System.out.println("Child class method");
	}
	public void methodCall(String name) {
		System.out.println("I'm "+name+", King "+name+". That is my name.");
	}
	public void classType() {
		System.out.println("sub-class");
	}
}
