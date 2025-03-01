package assignment2;

public class CelsiusToFahrenheit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cel = 37.0;

        double fact = 9.0 / 5.0;
        double offset = 32.0;

        double fahrenheit = (cel * fact) + offset;

        System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit%n", cel, fahrenheit);	
	}

}
