package exceptionhandling;
class OverPriceException extends Exception{
	OverPriceException(String message) {
		super(message);
	}
}

public class CustomException {

	public static void main(String[] args) {
		CustomException customException = new CustomException();
		int batPrice = 3000;
		try {
			customException.checkBatPrice(batPrice);
		} catch (OverPriceException e) {
			System.out.println(e.getMessage());
		}
	}
	public void checkBatPrice(int batPrice) throws OverPriceException {
		if(batPrice>3000)
			throw new OverPriceException("This is OVER price");
		System.out.println("Good Price..");
	}
}
