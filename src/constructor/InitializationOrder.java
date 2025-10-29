package constructor;

public class InitializationOrder {
	private String name="Hello";
	{
		System.out.println(name);
	}
	
	private static int count = 0;
	
	static {
		System.out.println(count);
	}
	static {
		count = count +10;
		System.out.println(count);
	}
	
	public InitializationOrder() {
		System.out.println("I am a constructor!!");
	}
	public static void main(String[] args) {
		
		InitializationOrder i1= new InitializationOrder();
		

	}

}
