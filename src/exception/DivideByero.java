package exception;

public class DivideByero {

	public static void main(String[] args) {
		int [] num = {100,20,30,50};
		int den[] = {1,4,0,2};
		for(int i=0;i<num.length;i++) {
			try {
				System.out.println(num[i]/den[i]);
			}catch(ArithmeticException e) {
				System.out.println(e);
			}finally {
				System.out.println("Finally block");
			}
			
		}

	}

}
