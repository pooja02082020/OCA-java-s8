package chap4summary;

public class RopeSwing {
	private static final String leftRope;
	private static final String rightRope;
	private static final String bench;
	private static final String name;

	// Initialize all final static variables inside a static block
	static {
		leftRope = "left";
		rightRope = "right";
		bench = "bench";
		name = "name";
	}

	public static void main(String[] args) {
		System.out.println(leftRope + " " + rightRope + " " + bench + " " + name);
	}
}