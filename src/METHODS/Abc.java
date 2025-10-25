package METHODS;

public class Abc {

	public void walk1() {
		
	}
	
	//default void walk2() {} -does not compile 
	
	//void public walk3() {} void walk()  --returntype menthodName()
	
	//static,abstract,final,synchronized,native,strictfp-optional
	
//	public final walk2() { --here should be  returntype
	
	int add(int a,int b) {
		return 0;    //here return is mandatory
		
	}
	
	void add1(int a,int b) {
		 return; //its not mandatory --but this is okay
	 }
	
	boolean check(int a) {
		if(a==5)
			return true;
		return false;  //if the method is returntype  for if else return both				
	}
	public String name() {
		return null;   //this is fine return " " is also fine
	}
	
	long lonnValue() {
		return 23;  // f
	}
//	int returnlong() {
//		return 4L;  int -if return long value there will be compilation issue
//	}
	
	int localValue() {
		int temp =15;
		return temp; //valid
	}
	
	void method1() throws ArrayIndexOutOfBoundsException{}
	void mwalk(int...num) {
		System.out.println(num[0]);
	}
}
