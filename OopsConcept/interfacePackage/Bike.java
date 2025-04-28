package interfacePackage;

public class Bike implements Vehicle, TwoWheelar{
	int distance;
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Bike starting..");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Bike moving..");
		distance+=10;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Bike stopped..");
	}
	
	@Override
	public void kickStart() {
		// TODO Auto-generated method stub
		System.out.println("Bike kick started...");
	}

	@Override
	public void turningHandleBar(String direction) {
		// TODO Auto-generated method stub
		System.out.println("Turnig "+direction+" direction");
	}
	public int travelledKilometers() {
		return distance;
	}
}
