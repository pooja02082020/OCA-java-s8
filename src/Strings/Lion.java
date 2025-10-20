package Strings;

public class Lion {

	public static void main(String[] args) {
		Lion l1=new Lion();
		Lion l2=new Lion();
		Lion l3=l1;
		System.out.println(l1==l1);
		System.out.println(l1==l2); //false
		System.out.println(l1==l3);
		System.out.println(l1.equals(l1));
		System.out.println(l1.equals(l2)); //false: by default it will be false because two object has different hash code 
		System.out.println(l1.equals(l3));
		
	}

}
