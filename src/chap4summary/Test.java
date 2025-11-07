package chap4summary;

public class Test {
	public void print(byte x) {
		System.out.println("byte");
	}

	public void print(int x) {
		System.out.println("int");
	}
	
	public void print(float x) {
		System.out.println("float");
	}
	
	public void print(Object x) {
		System.out.println("object");
	}
	public static void main(String[] args) {
		Test t = new Test();
		short s = 123;
		t.print(s);
		t.print(true);
		t.print(6.754);
	
		 final String fName = "James";
	        String lName = "Gosling";
	        String name1 = fName + lName;
	        String name2 = fName + "Gosling";
	        String name3 = "James" + "Gosling";
	        System.out.println(name1 == name2);
	        System.out.println(name2 == name3);
		 
	}
}
