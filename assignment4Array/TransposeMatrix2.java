package assignment4Array;

public class TransposeMatrix2 {

	public static void main(String[] args) {
	
		int arr[][] = {	{1,2,3},
						{4,5,6},
						{7,8,9},
						{10,11,12}};
		
		for(int j=0;j<arr[0].length;j++) {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
