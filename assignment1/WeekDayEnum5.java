package assignment1;

enum Days{
	SUNDAY, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday 
	
}
public class WeekDayEnum5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		System.out.println(new WeekDayEnum5().getDay(n));
	}
	public String getDay(int n) {
		n = (n-1)%7;
		
		return Days.values()[n].toString();
	}
}
