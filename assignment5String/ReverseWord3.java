package assignment5String;

public class ReverseWord3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "siva ram cricketer";
		System.out.println( new ReverseWord3().reverse(str, "",""));
	}
	public String reverse(String str, String word, String ans) {
		if(str.length()==0)
			return word+ans;
		if(str.charAt(0)==' ')
		{
			ans = word+" "+ans;
			word = "";
		}
		return reverse(str.substring(1), word+str.charAt(0), ans);
	}
}
