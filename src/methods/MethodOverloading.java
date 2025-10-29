package methods;

public class MethodOverloading {
	public static void main(String[] args) {
		MethodOverloading methods = new MethodOverloading();
		methods.callMethods();
	}
	void callMethods() {
		//fly(10); //it will call the method with int numFlies
		fly((short)12); //to call  short numfeet expilicitly we have to specify short
		fly(3); //Integer will also be called becoz of autoboxing if we comment outwith int numflies
		fly(new Integer(10)); //to call Integer one
		
		fly("Pooja");
	}
	
	void fly(String str) {
		System.out.println("String type is called");
	}
	
	void fly(Object obj) {
		System.out.println("Object type is called");
	}
	public void fly(int numFiles) {
		System.out.println("int num Flies is called");
	}

	public void fly(Integer numFiles) {
		System.out.println("Integer num Flies is called");
	}
	public void fly(short numFeet) {
		System.out.println("short num feet is called");
	}
	public void fly(int numFiles,short numFeet) {

	}

	public void fly(short numFeet,int numFiles) {

	}
}
