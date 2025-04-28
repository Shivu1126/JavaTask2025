package thisAndSuper;

public class Main {

	public static void main(String[] args) {
		SuperClass superClass = new SubClass("Shivv", 24);

//		System.out.println(superClass.name);
//		System.out.println(superClass.age);
		System.out.println(superClass.getName());
		System.out.println(superClass.getAge());
		
		Bike bike = new Bike();
		System.out.println("Bike Tier Count - "+bike.tierCount);
		Lorry lorry = new Lorry();
		System.out.println("Lorry Tier Count - "+lorry.tierCount);
	}

}
class Vehicle{
	int tierCount = 6;
}
class Bike extends Vehicle{
	int tierCount = 2;
	public int getTierCount()
	{
		return this.tierCount;
	}
}
class Lorry extends Vehicle{
	public int getTierCount() {
		return super.tierCount;
	}
}