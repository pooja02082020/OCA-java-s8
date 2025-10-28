package test1;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		int a=100;
		System.out.println(-a++);
		
		
//		 try {
//             main(args);
//         } catch (Exception ex) {
//             System.out.println("CATCH-");
//         }
//             System.out.println("OUT");
//     }

		  String s1 = "OCAJP";  //string pool
	        String s2 = "OCAJP" + "";
	        System.out.println(s1 == s2);
	        
//	        short [] args = new short[]{50, 50};  //main method variable name is also args so duplicate
//	         args[0] = 5;
//	         args[1] = 10;
//	         System.out.println("[" + args[0] + ", " + args[1] + "]");
	        
	        StringBuilder sb = new StringBuilder(100);
	        System.out.println(sb.length() + ":" + sb.toString().length());
	        
	        String s = new String("Hello");
	         List<String> list = new ArrayList<>();
	         list.add(s);
	         list.add(new String("Hello"));
	         list.add(s);
	         s.replace("l", "L");
	 
	         System.out.println(list);
	         
	         int [] arr = {2, 1, 0};
	         for(int i : arr) {
	             System.out.println(arr[i]);
	         }
	         
	         byte var = 100;
	         switch(var) {
	             case 100:
	                 System.out.println("var is 100");
	                 break;
	             case -120:  //-128 to 127 only for byte
	                 System.out.println("var is 200");
	                 break;
	             default:
	                 System.out.println("In default");
	         }
	         
	         //double [] arr1 = new int[2]; //Line 3- CANNOT CONVERT FROM INT array TO DOUBLE array & DOUBLE TO INT
	         //System.out.println(arr1[0]); //Line 4
	         int i = '5';
	         m(i);
	         m('5');
	         
	         do {
	             System.out.println(100);
	         } while (false);
	         System.out.println("Bye");
	}
	
	
	private static void m(int x) {
        System.out.println("int version");
    }

    private static void m(char x) {
        System.out.println("char version");
    }
}
	
	


