package pattern;

public class LeftHalf14 {

	public static void main(String[] args) {
		int n = 5;
		int temp = n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++)
			{
				if(j>=temp)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			temp--;
			System.out.println();
		}
	}

}
//    *
//   **
//  ***
// ****
//*****