package accessSpecifier;

import accessSpecifier.Outter.InnerB;
import accessSpecifier.Outter.InnerC;
import accessSpecifier.Outter.InnerD;

public class AccSpecController {

	public static void main(String[] args) {
		AccessSpecifiers accessSpecifiers = new AccessSpecifiers();
		int publicVariable =  accessSpecifiers.publicVariable;
//		int privateVariable = accessSpecifiers.privateVariable; you can't access private variable in another class
		int protectedVariable = accessSpecifiers.protectedVariable;
// 		you can use protected variable in same package. 
		int defaultVariable = accessSpecifiers.defaultVariable;
		
		accessSpecifiers.publicMethod();
		accessSpecifiers.protectedMethod(); 
		accessSpecifiers.defaultMehtod();
		//you doesn't need to extends class when you call protected method within the same package.
		
		//class
//		private inner class
		Outter outter = new Outter();
		outter.accessInnerA("Helloo");;
//		protected inner class
		InnerB innerB = outter.new InnerB();
		innerB.alert("On your left..!!");
//		public inner class
		InnerC innerC = outter.new InnerC();
		innerC.test("We have HULK");
// 		default inner class
		InnerD innerD = outter.new InnerD();
		innerD.defaultMethod("I can do this all day");
		
	}

}
