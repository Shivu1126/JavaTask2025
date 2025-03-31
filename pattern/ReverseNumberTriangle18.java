package pattern;

public class ReverseNumberTriangle18 {

	public static void main(String[] args) {
		int n = 5;
		int temp = 1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++)
			{
				if(j>=temp)
					System.out.print(" "+temp++);
				else
					System.out.print(" ");
			}
			temp = i+1;
			System.out.println();
		}
	}

}
//1 2 3 4 5
// 2 3 4 5
//  3 4 5
//   4 5
//    5