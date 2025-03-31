package pattern;

public class MirrorImage19 {

	public static void main(String[] args) {
		int n = 5;
		int temp = 1;
		int k = n;
		for(int i=1;i<=n*2-1;i++) {
			for(int j=1;j<=n;j++)
			{
				if(j>=temp)
					System.out.print(" "+temp++);
				else
					System.out.print(" ");
			}
			if(i<n)
				temp = i+1;
			else {
				temp = k-1;
				k--;
			}
			System.out.println();
		}
	}
}

//1 2 3 4 5
// 2 3 4 5
//  3 4 5
//   4 5
//    5
//   4 5
//  3 4 5
// 2 3 4 5
//1 2 3 4 5