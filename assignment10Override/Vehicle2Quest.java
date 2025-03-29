package assignment10Override;

class Vehicle{
	private String brand;
	private int speed;
	public Vehicle(String brand, int speed) {
		this.brand = brand;
		this.speed = speed;
	}
	public void start() {
		System.out.println("Vehicle Started");
	}
	public void move() {
		System.out.println("Vehicle is moving");
	}
	public void stop() {
		System.out.println("Vehicle Stoped");
	}
	public void display() {
		System.out.println("Brand : "+brand);
		System.out.println("Speed : "+speed+"km/h");
	}
}
class Bike extends Vehicle{
	public Bike(String brand, int speed) {
		super(brand, speed);
	}
	public void start() {
		System.out.println("Bike Started");
	}
	public void move() {
		System.out.println("Bike is moving");
	}
	public void stop() {
		System.out.println("Bike Stoped");
	}
}
class Car extends Vehicle{
	public Car(String brand, int speed) {
		super(brand, speed);
	}
	public void start() {
		System.out.println("Car Started");
	}
	public void move() {
		System.out.println("Car is moving");
	}
	public void stop() {
		System.out.println("Car Stoped");
	}
}
class Lorry extends Vehicle{
	public Lorry(String brand, int speed) {
		super(brand, speed);
	}
}
class Cycle extends Vehicle{
	public Cycle(String brand, int speed) {
		super(brand, speed);
	}
	public void start() {
		System.out.println("Cycle Started");
	}
	public void move() {
		System.out.println("Cycle is moving");
	}
	public void stop() {
		System.out.println("Cycle Stoped");
	}
}

public class Vehicle2Quest {

	public static void main(String[] args) {
		Vehicle bike = new Bike("RX100", 110);
		Vehicle car = new Car("KIA", 210);
		Vehicle lorry = new Lorry("Toyata",130);
		Vehicle cycle = new Cycle("HERO", 50);
		
		bike.start();
		bike.move();
		bike.stop();
		bike.display();
		
		System.out.println();
		car.start();
		car.move();
		car.stop();
		car.display();
		
		System.out.println();
		lorry.start();
		lorry.move();
		lorry.stop();
		lorry.display();
		System.out.println();
		
		cycle.start();
		cycle.move();
		cycle.stop();
		cycle.display();
		System.out.println();
	}

}
