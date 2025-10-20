package OperatorsAndStatements;

public class AssignmentOperators {

	public static void main(String[] args) {
		int x=1;
		long y= 322222222222L; 
		
	//	int z= 9.0; does not compile
		
//Explicit Type Casting 
		
		int x3 =(int) 1.0;
		short y3 = (short)134556; //overflows byte from -128 to +127
		
		System.out.println(y3);
		
		short x1 = 10;
		short x2= 3;
		short z = (short) (x1*x2);  // when we do arthmetic oppertation short vale will change to int
		
		long a=5;
		long b = (a=3);
		System.out.println("a is "+a +" b is "+b);
		

	}

}
