package pattern;

public class ButterflyStar10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int m = 2*n-1;
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=m;j++) {
				if(i<=n && (i>=j || j>=m-i+1) ) {
					if((j%2==1 && i%2==1) || (j%2==0 && i%2==0))
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				else if(i>n && (j<=m-i+1 || j>=i)) {
					if((j%2==1 && i%2==1) || (j%2==0 && i%2==0))
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

}
