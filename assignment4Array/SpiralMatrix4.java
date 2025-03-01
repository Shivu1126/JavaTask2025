package assignment4Array;

import java.util.Arrays;
import java.util.Scanner;

public class SpiralMatrix4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size");
		int n = scanner.nextInt();
		int matrix[][] = new int[n][n];
		SpiralMatrix4 matrixObj = new SpiralMatrix4();
		matrixObj.spiral(n, matrix);
		for(int i=0;i<n;i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}
	public void spiral(int n, int[][] matrix) {
		int size = n*n;
		int i = 0, j = 0;
		int nextI = 1, nextJ = 1;
        int startI = 1, startJ = 0;
        int endI = n - 1, endJ = n - 1;
        int count = 1;
        while (count <= size) {
            // right
            while (j <= endJ) {
                matrix[i][j] = count++;
                if (count == size+1)
                    return;
                j++;
            }
            i++;
            j--;
            // down
            while (i <= endI) {
                matrix[i][j] = count++;
                if (count == size+1)
                    return;
                i++;
            }
            i--;
            j--;
            // left
            while (j >= startJ) {
                matrix[i][j] = count++;
                if (count == size+1)
                    return;
                j--;
            }
            j++;
            i--;
            // up
            while (i >= startI) {
                matrix[i][j] = count++;
                if (count == size+1)
                    return;
                i--;
            }
            j = nextJ;
            i = nextI;
            nextI++;
            nextJ++;
            startI++;
            startJ++;
            endI--;
            endJ--;
        }
		
	}

}
