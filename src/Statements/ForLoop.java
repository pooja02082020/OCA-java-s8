package Statements;

public class ForLoop {
	
	public static void main(String[] args) {
		int x=0;
		long y=10;
		for( y=0,x=4;x<5&&y<10;x++,y++) {
			System.out.println(y + "");
		}
		System.out.println(x);
		
		final String[] names = new String[3];
		names[0]="a";
		names[1]="apple";
		names[2]="anti";
		
		for(String name : names) {
			System.out.println(name);
		}
		
		int [] values = new int [3];
		values[0]=10;
		values[1]=new Integer(5);
		values[2]=15;
		System.out.println();
		for(int i=1;i<values.length;i++) {
			System.out.println(values[i]-values[i-1]);
		}
	}


}
	
