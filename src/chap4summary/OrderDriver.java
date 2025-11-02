package chap4summary;

public class OrderDriver {

	public static void main(String[] args) {
		System.out.println(Order.result + " "); //only static block u
		System.out.println(Order.result + " "); //u
		new Order();   //ucr
		new Order();   //cr because static block will only call once
		System.out.println(Order.result + " ");
	}

}
