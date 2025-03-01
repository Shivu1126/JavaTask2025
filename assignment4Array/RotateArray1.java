package assignment4Array;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray1 {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter size");
		int size = scanner.nextInt();
		System.out.println("Enter values");
		int nums[] = new int[size];
		for(int i=0;i<size;i++)
			nums[i] = scanner.nextInt();
		System.out.println("Enter rotate count..");
		int k = scanner.nextInt();
		
		int ans[] = new int[nums.length];
        k = k%nums.length;
        int index = 0;
        for(int i=nums.length - k ;i< nums.length;i++){
           ans[index++] = nums[i];
        }
        for(int i=0;i < ans.length - k;i++){
            ans[index++] = nums[i];
        }
        System.out.println(Arrays.toString(ans));
	}

}
