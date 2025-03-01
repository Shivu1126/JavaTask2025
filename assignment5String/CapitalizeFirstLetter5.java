package assignment5String;

public class CapitalizeFirstLetter5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "i love india";
		char[] charArr = str.toCharArray();
		charArr[0] = Character.toUpperCase(str.charAt(0));
		for(int i=0;i<charArr.length-1;i++) {
			if(str.charAt(i)==' ') {
				charArr[i+1] = Character.toUpperCase(str.charAt(i+1));
			}
		}
		System.out.println(String.valueOf(charArr));
	}
}
