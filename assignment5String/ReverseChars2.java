package assignment5String;

public class ReverseChars2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "SivaramShiv";
		String strRev = "";
		for(int i=str.length()-1;i>=0;i--)
			strRev+=str.charAt(i);
		System.out.println(strRev);
	}

}
