package staticPractice;

public class Counter {

	static int x=0;
	int y =0;
	static final int z=10;
	static final int z2;
	
	static {
		int count =10;
		x= 30;
		z2=34; //this is fine becoz first assignment happpening in static block
		//z=34;
	}
	
	public static int getCounter() {
	//	System.out.println(y);  //compiler issue
		//z=3;  //final cannot be reassigned
		return x;
		
	}
	
	public void func() {
		System.out.println(x); //x already exists becoz it has been loaded with the class counter
		//z=20; //final cannot be reassigned
	}
}
