package assignment4Array;

import java.util.Scanner;

public class MatrixMultiplication3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter number of rows of first matrix: ");
	        int row = scanner.nextInt();
	        System.out.print("Enter number of columns of first matrix: ");
	        int col = scanner.nextInt();

	        int[][] firstArr = new int[row][col];
	        int[][] secArr = new int[row][col];
	        
	        int[][] product = new int[row][col];

	        System.out.println("Enter elements of first matrix:");
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                firstArr[i][j] = scanner.nextInt();
	            }
	        }

	        System.out.println("Enter elements of second matrix:");
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                secArr[i][j] = scanner.nextInt();
	            }
	        }
	        
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                product[i][j] = 0;
	                for (int k = 0; k < col; k++) {
	                    product[i][j] += firstArr[i][k] * secArr[k][j];
	                }
	            }
	        }

	        System.out.println("Product of the matrices:");
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                System.out.print(product[i][j] + " ");
	            }
	            System.out.println();
	        }

	}
}