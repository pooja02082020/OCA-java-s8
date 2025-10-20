package Strings;

public class StringBuilderMethods {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("animals");
		
		String sub = sb.substring(sb.indexOf("a"),sb.indexOf("al"));
		System.out.println(sub);
		int len = sb.length();
		System.out.println(len);
		char ch = sb.charAt(6);
		System.out.println(ch);
		
		StringBuilder sb1= new StringBuilder().append(1).append('c');
		sb1.append("-").append(true);
		System.out.println(sb1);

		//insert(offset,String str)
		StringBuilder sb2 = new StringBuilder("animals");
		sb2.insert(7, "-");
		System.out.println(sb2);
		sb2.insert(0, "-");
		System.out.println(sb2);
		sb2.insert(4, "-");
		System.out.println(sb2);
		
		//delete & deleteCharAt(int index);
		//delete(int start,int end) 
		sb2.delete(1, 3);
		System.out.println(sb2);
		sb2.deleteCharAt(0);
		System.out.println(sb2);
		//sb2.deleteCharAt(10); //it will throw exception because of out of boundary exception
		
		sb2.reverse();
		System.out.println(sb2);
		
		String x = sb2.toString();
		//now string becomes mutable to immutable
	}

}
