
public class WrapperClassExamples {

	public static void main(String[] args) {
		Integer i=new Integer(10);
		//int x= i.intValue();  -it has been removed to changed to primitive int
		
		int x=i;  //from Integer to int - autoboxing
		
		String num = "123";
		int primitive =Integer.parseInt(num);  //String to int
		System.out.println(primitive);
		 
		Integer wrapper = Integer.valueOf(num); //String to Integer
		System.out.println(num);  
		
		int i2= Integer.valueOf("24").intValue();  //because of autoboxing
		System.out.println(i2);
		
		

	}

}
