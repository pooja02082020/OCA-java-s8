package Strings;

public class UnderstandingEquality {

	public static void main(String[] args) {
		StringBuilder one = new StringBuilder();
		StringBuilder two= new StringBuilder();
		StringBuilder three = one.append("a");
		System.out.println(one==two);
		System.out.println(one==three);
		
		String x= "Banana";
		String y= "Banana";
		System.out.println(x==y);

		String x1=new String("Banana");
		String x2= new String("Banana");
		System.out.println(x1==x2);
		
		//Tricky Example
		String y1= "Pooja";
		String y2=" Pooja".trim();
		System.out.println(y1==y2);
		
		String y3= "Pooja";
		String y4= new String("Pooja");
		System.out.println(y3==y4);
		//Never use == to compare String Objects, always use the equals or equals IgnoreCase
		
		
	}

}
