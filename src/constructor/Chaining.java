package constructor;

public class Chaining {
	int x,y;

	public Chaining() {
		System.out.println("I am a defualt constructor");
		
	}

	public Chaining(int x) {
		this();  //this will call the constructor with default constructor
		this.x=x;
	}

	public Chaining(int x, int y) {
		this(x); //this has to be first line when calling other constructor from one constructor
		this.y=y;
	}
	public static void main(String[] args) {
		Chaining c = new Chaining(10,20);
		System.out.println(c.x);
		System.out.println(c.y);
	}
}
