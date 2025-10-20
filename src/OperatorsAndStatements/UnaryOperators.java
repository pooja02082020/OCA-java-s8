package OperatorsAndStatements;

public class UnaryOperators {

	public static void main(String[] args) {
//		post increment and pre increment

		int x=3;
		int y=++x * 5/x-- + --x;
		System.out.println(x);
		System.out.println(y);
	}

}
