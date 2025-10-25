package chap3Summary;

public class Lion {
	
	public void roar(String roar1,StringBuilder roar2) {
		roar1.concat("!!!");  
		roar2.append("!!!");
	}
public static void main(String[] args) {
	String roar1= "roar";
	StringBuilder roar2 = new StringBuilder("roar");
	new Lion().roar(roar1,roar2);
	System.out.println(roar1 + " "+roar2);  //roar1 is string so doesnot change
	
	String letters="abcdef";
	System.out.println(letters.length()); //6
	System.out.println(letters.charAt(3)); //d
	//System.out.println(letters.charAt(6));  //an exception is thrown
	
	String numbers = "012345678";
	System.out.println(numbers.substring(1,3));
	System.out.println(numbers.substring(7,7));
	System.out.println(numbers.substring(7));
	
	String s="purr";
	s.toUpperCase();
	s.trim();
	s.substring(1,3);
	s+=" two";
	System.out.println(s.length());
}
}
