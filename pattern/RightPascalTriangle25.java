package pattern;

public class RightPascalTriangle25 {

	public static void main(String[] args) {
		int n = 4;
		int m = 2*n-1;
		int temp = 1;
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=temp;j++)
			{
				if((i%2==1 && j%2==1) || (i%2==0 && j%2==0))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			if(i<n)
				temp++;
			else	
				temp--;
			System.out.println();
		}
		
	}

}
