package assignment5String;

public class VowelsCount1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ShivShivAShiv";
		int count = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' ||  str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || 
			str.charAt(i)=='A' || str.charAt(i)=='E' ||  str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U'	)
				count++;
		}
		System.out.println("Vowels count : "+count);
	}

}
