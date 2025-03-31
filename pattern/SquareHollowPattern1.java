package pattern;

public class SquareHollowPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || i==n || j==n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
//* * * * * 
//*       * 
//*       * 
//*       * 
//*       * 
//* * * * * 