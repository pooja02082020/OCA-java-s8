package Strings;

public class StringMethods {

	public static void main(String[] args) {
		String s = "Enclyclopedia";
		System.out.println(s.length());
		
		System.out.println(s.charAt(0));
		
		
		System.out.println(s.indexOf('o'));
		System.out.println(s.indexOf("cl")); //
		System.out.println(s.indexOf("o",3));
		
		System.out.println("*****");
		System.out.println(s.substring(5));
		System.out.println(s.substring(s.indexOf('l')));
		System.out.println(s.substring(2,4));
		
		System.out.println("----------------");
		
		System.out.println(s.substring(3,3));
		//System.out.println(s.substring(3,2));
		//System.out.println(s.substring(3,13));
		
	//These will throw exception
		s.toUpperCase();
		System.out.println(s); // tog get the value to uppercase we need to reassign because string is immutable and we will get same output
		
		System.out.println("77777777777");
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		//equals -both characters and cases should be same and equalsIgnoreCAse() ==only characters should be same;
		System.out.println("abc".equals("ABC"));
		System.out.println("ABC".equals("ABC"));
		System.out.println("abc".equalsIgnoreCase("ABC"));
		
		System.out.println("starts with ends with examples");
		//startswith and endswith
		System.out.println(s.startsWith("En"));
		System.out.println(s.endsWith("oo"));
		
		System.out.println("contains");
		System.out.println(s.contains("N"));
		System.out.println(s.contains("nc"));
		
		System.out.println("replace");
		System.out.println(s.replace('n', 'y'));
		System.out.println(s.replace("pedia", "mdsdd"));
		
		System.out.println("TRIM METHOD");
		System.out.println("\t    a b c \n");
		System.out.println("\t    a b c \n".trim());
	
		System.out.println("method chainaingg ");
		
		String start = "         Animal    " ;
		String trimmed = start.trim();
		String lowercase = trimmed.toLowerCase();
		
		System.out.println(lowercase);
		
		String result = start.trim().toLowerCase().substring(1);
		System.out.println("result is: "+ result);
		
		System.out.println(s);
				
		
		

	}

}
