package controller;

import accessSpecifier.AccessSpecifiers;

public class Controller extends AccessSpecifiers{

	public static void main(String[] args) {
		Controller controller = new Controller();
		controller.init(controller);
		int val = controller.protectedVariable;
	}
	public void init(Controller controller) {
		AccessSpecifiers accessSpecifiers = new AccessSpecifiers();
		int publicVariable =  accessSpecifiers.publicVariable;
//		int privateVariable = accessSpecifiers.privateVariable; you can't access private variable in another class
		int protectedVariable = controller.protectedVariable;
		//you can use protected variable in sub-class if protected variable class is another package.
//		int defaultVariable - only within a same package
		
		
		accessSpecifiers.publicMethod();
		controller.protectedMethod();//you can access protected method using sub-class.
//		controller.defaultMehtod();
//		controller.privateMethod();
//		accessSpecifiers.privateMethod();	you can't call private method
		
		//class
//		private class - not allowed. Inner private class is allowed.
//		default class - only allowed at same package.
//		public class - access allowed at any package.
//		protected class - not allowed. Inner protected class is allowed.
	}
}
