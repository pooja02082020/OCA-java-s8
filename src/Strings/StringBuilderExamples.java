package Strings;

public class StringBuilderExamples {

	public static void main(String[] args) {
		String alpha = "";
		for(char current='a';current<='z';current++)
			alpha=alpha+current;
		System.out.println(alpha);
		
		//Now using StringBuilder
		StringBuilder alphaMax =new StringBuilder();
		for(char current='a';current<='z';current++)
			alphaMax.append(current);
		
		System.out.println(alphaMax);
		
		StringBuilder sb = new StringBuilder("start");
		sb.append("+middle");  //sb = sb+middle
		StringBuilder same =sb.append("+end");  //sb = start+middle+end
		System.out.println(sb);
		System.out.println(same);
		
		StringBuilder sb2 = new StringBuilder(10);
		

	}

}
