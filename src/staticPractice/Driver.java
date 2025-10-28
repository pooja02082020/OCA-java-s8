package staticPractice;

public class Driver {

	public static void main(String[] args) {
		System.out.println(Counter.x);
		Counter.x++;
		Counter counter = new Counter();
		counter = null;
		System.out.println(counter.x); // there won't be any null pointer exception as it is associated with class not
										// with objects
		// System.out.println(counter.y); // there will be nullpointer exception

		System.out.println(Counter.getCounter());

		Counter c1 = new Counter();
		c1.x++;
		Counter c2 = new Counter();
		c2.x = 0;

		Counter c3 = new Counter();
		c3.x += 2;
		Counter.x++;
		System.out.println(Counter.getCounter());

	}

}
