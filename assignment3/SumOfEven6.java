package assignment3;

public class SumOfEven6 {

	public static void main(String[] args) {
		int arr[] = {12 , 42, 11, 3, 21, 23, 8, 10, 13, 1, 0, 96};
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==1)
				continue;
			sum+=arr[i];
		}
		System.out.println(sum);
	}
}
