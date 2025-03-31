package pattern;

public class Square11 {

	public static void main(String[] args) {
		int n = 6;
		for(int i=1;i<=n*n;i++) {
			System.out.print("* ");
			if(i%n==0)
				System.out.println();
		}
	}

}
