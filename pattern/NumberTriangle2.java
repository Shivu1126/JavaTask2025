package pattern;

public class NumberTriangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int temp = n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(temp<=j)
					System.out.print(i+" ");
				else
					System.out.print(" ");
			}
			temp--;
			System.out.println();
		}
	}

}
//	 1 
//  2 2 
// 3 3 3 
//4 4 4 4