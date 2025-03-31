package pattern;

public class Kpattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int temp = n;
		boolean isDown = true;
		for(int i=1;i<=n*2-1;i++) {
			for(int j=1;j<=temp;j++) {
				System.out.print("*");
			}
			if(isDown)
				temp--;
			else
				temp++;
			if(temp==1)
				isDown=!isDown;
			System.out.println();
		}
	}
}
//****
//***
//**
//*
//**
//***
//****