package assignment3;

import java.util.Scanner;

public class SecondOccur4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scanner.nextInt();
		System.out.println("Enter values : ");
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
			arr[i] = scanner.nextInt();
		
		System.out.println("Enter target");
		int target = scanner.nextInt();
		
		int count = 0;
		for(int i=0;i<size;i++) {
			if(arr[i]==target)
				count++;
			if(count==2)
			{
				System.out.println("Occured in "+i+" index.");
				return;
			}
		}
		System.out.println("Not Occured.");
		
	}
}
// 3 1 35 21 1 3 5 5 23 