package assignment2;

import java.util.Scanner;

public class BitwiseOperators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers..");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		//Bitwise OR
		System.out.println("Bitwise OR-> a|b = "+a+"|"+b+"="+(a|b));
		//Bitwise AND
		System.out.println("Bitwise AND-> a&b = "+a+"&"+b+"="+(a&b));
		//Bitwise XOR
		System.out.println("Bitwise XOR-> a^b = "+a+"^"+b+"="+(a^b));
		//Left shift
		System.out.println("Left shift a<<2 -> "+a+"<<2 = "+(a<<2));
		//Right shift
		System.out.println("Right shift b>>2 -> "+b+">>2 = "+(b>>2));
	}

}
