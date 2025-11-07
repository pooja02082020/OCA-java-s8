package chap4summary;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class B1 {

	private static void add(double d1, double d2) {
		System.out.println("double version: " + (d1 + d2));
	}

	private static void add(Double d1, Double d2) {
		System.out.println("Double version: " + (d1 + d2));
	}

	public static void main(String[] args) {

		ArrayList<Integer> original = new ArrayList<>();
		original.add(new Integer(10));

		ArrayList<Integer> cloned = (ArrayList<Integer>) original.clone();
		Integer i1 = cloned.get(0);
		++i1;
		System.out.println(cloned);

		String s1 = "OcA";
		String s2 = "oCa";
		System.out.println(s1.equals(s2));
		add(10.0, new Integer(10));

		LocalDate date = LocalDate.parse("1980-03-16");
		System.out.println(date.minusYears(-5));

		System.out.println("Output is: " + (10 != 5));
		List<String> list = new ArrayList<>();
		list.add(0, "Array");
		list.add(0, "List");

		System.out.println(list);
		Boolean b1 = new Boolean("tRuE");
		Boolean b2 = new Boolean("fAlSe");
		Boolean b3 = new Boolean("abc");
		Boolean b4 = null;
		System.out.println(b1 + ":" + b2 + ":" + b3 + ":" + b4);

//	         List<String> list = new ArrayList<>();
//	         list.add("ONE");
//	         list.add("TWO");
//	         list.add("THREE");
//	         list.add("THREE");

		System.out.println(list);
	}

}
