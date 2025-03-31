package pattern;

public class ZeroOneTriangle6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean isOdd = true;
		for(int i=1;i<=n;i++) {
			int k = isOdd?1:0;
			for(int j=1;j<=i;j++) {
				System.out.print(k +" ");
				k = k==0?1:0;
			}
			isOdd = !isOdd;
			System.out.println();
		}
		
	}
}
//1 
//0 1 
//1 0 1 
//0 1 0 1