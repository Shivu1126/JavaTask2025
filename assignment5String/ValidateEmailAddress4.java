package assignment5String;

public class ValidateEmailAddress4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = "siva11vk@gmail.com";
		
		System.out.println(new ValidateEmailAddress4().isValid(email)?"Valid":"Invalid");
	}
	public boolean isValid(String mail) {
		if(mail.charAt(0)=='@' || mail.charAt(mail.length()-1)=='.') {
			return false;
		}
		if(!mail.contains("@"))
			return false;
		if(!mail.endsWith(".com") && !mail.endsWith(".org") && !mail.endsWith(".in") && !mail.endsWith(".corp")) {
			return false;
		}
		return true;
	}
}
