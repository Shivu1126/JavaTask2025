package interfacePackage;

public class Controller {

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.start();
		bike.kickStart();
		bike.drive();
		bike.turningHandleBar("Right");
		bike.drive();
		bike.turningHandleBar("Left");
		bike.drive();
		bike.drive();
		bike.stop();
		System.out.println("Travelled KM : "+bike.distance+" Km");
	}

}
