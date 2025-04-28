package accessSpecifier;

public class AccessSpecifiers {
	private int privateVariable;
	public int publicVariable;
	protected int protectedVariable;
	int defaultVariable;
	public void publicMethod() {
		System.out.println("Public Method");
	}
	private void privateMethod() {
		System.out.println("Private Method");
	}
	protected void protectedMethod() {
		System.out.println("Protected Method");
	}
	void defaultMehtod() {
		System.out.println("Default Method");
	}
}
//private class privateClass{
//	
//} you can't create private Class. If it's private, no other class (even the JVM) can access it.
//you can create private inner class
class Outter{
	private class InnerA{
		void showToast(String msg) {
			System.out.println(msg);
		}	
	}
	protected class InnerB{
		void alert(String alertMsg) {
			System.out.println(alertMsg);
		}
	}
	public class InnerC{
		void test(String msg) {
			System.out.println(msg);
		}
	}
	class InnerD{
		void defaultMethod(String msg) {
			System.out.println(msg);
		}
	}
	
	public void accessInnerA(String msg) {
		InnerA inner = new InnerA();
		inner.showToast(msg);
	}
}
