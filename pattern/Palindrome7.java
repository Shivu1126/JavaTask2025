package pattern;

public class Palindrome7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int m = n*2 - 1;
		int temp = n;
		for(int i=1;i<=n;i++) {
			int val = i;
			boolean isIncrease = false;
			for(int j=1;j<=m-temp+1;j++) {
				if(j>=temp)
				{
					if(isIncrease)
					{
						System.out.print(val++ +" ");
					}
					else
						System.out.print(val-- +" ");
				}
				else
					System.out.print("  ");
				if(val==1)
					isIncrease = !isIncrease;		
			}
			temp--;
			System.out.println();
		}
	}

}
