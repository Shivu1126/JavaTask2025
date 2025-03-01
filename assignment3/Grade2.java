package assignment3;

import java.util.Scanner;

public class Grade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Grade2 grade = new Grade2();
		System.out.println("Enter the score..");
		int score = scanner.nextInt();
		System.out.println(grade.getGrade(score));
	}
	public char getGrade(int score) {
		if(score>=90) {
			return 'A';
		}
		else if(score>=75) {
			return 'B';
		}
		else if(score>=60) {
			return 'C';
		}
		else if(score>=50) {
			return 'D';
		}
		else if(score>=35) {
			return 'E';
		}
		else {
			return 'F';
		}
	}
	
}
