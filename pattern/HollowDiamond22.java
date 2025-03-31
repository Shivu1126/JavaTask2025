package pattern;

public class HollowDiamond22 {

	public static void main(String[] args) {
		int n = 4;
		int temp = 0;
		boolean isInc = true;
		for(int i=0;i<n*2 -1;i++) {
			for(int k=n-2;k>=temp;k--)
				System.out.print(" ");
			for(int j=0;j<=temp;j++) {
				if(j==0 || j==temp)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			if(isInc)
				temp++;
			else
				temp--;
			if(temp==n-1)
				isInc = !isInc;
			System.out.println();
		}
	}
}
//   * 
//  * * 
// *   * 
//*     * 
// *   * 
//  * * 
//   * 