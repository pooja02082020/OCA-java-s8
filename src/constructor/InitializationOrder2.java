package constructor;

public class InitializationOrder2 {
	static {
		add(2);  //first
	}

	static void add(int num) {
		System.out.println(num + " ");
	}

	public InitializationOrder2() {
		add(5);  //constructor -fifth last
	}

	static {
		add(4);  //second
	}
	
	{add(6);}  //goes to initializer block -- 3rd

	static {
		new InitializationOrder2();  //new object is created
	}
	{
		add(8); //4th
	}

	public static void main(String[] args) {
	}

}