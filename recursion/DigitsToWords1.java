package recursion;

public class DigitsToWords1 {

	public static void main(String[] args) {
		int n = 3201;
		String arr[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Nine", "Ten"};
		DigitsToWords digitsToWords = new DigitsToWords();
		System.out.println(digitsToWords.getWords(n, arr, ""));
	}
}
class DigitsToWords{
	public String getWords(int n, String[] arr, String str) {
		if(n<=0)
			return str;
		return getWords(n/10, arr, arr[n%10]+str);
	}
}

//How to print digitsToWords(int number) for example digitToWords(321) should print three or two ones using recursion?