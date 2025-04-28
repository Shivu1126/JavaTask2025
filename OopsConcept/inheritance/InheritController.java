package inheritance;

public class InheritController {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass parentClass = new ChildClass();	//polymorphism or upcasting	
		parentClass.methodCall();
		
		ChildClass childClass = new ChildClass();
		childClass.methodCall("Racknor");
		
		ParentClass multi = new MultilevelInherit();
		multi.methodCall();	//child class method called
		
	}

}
