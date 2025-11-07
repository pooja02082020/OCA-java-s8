package chap4summary;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Questions {

	public static void main(String[] args) {
		
		
		  String fruit = "mango";
	         switch (fruit) {
	             case "Apple":
	                 System.out.println("APPLE");
	             case "Mango":
	                 System.out.println("MANGO");
	             case "Banana":
	                 System.out.println("BANANA");
	                 break;
	             default:
	                 System.out.println("ANY FRUIT WILL DO");
	         }
		
		  List<Integer> li = new ArrayList<Integer>();
		  
	         li.add(27);
	         li.add(27);
	 
	         li.add(new Integer(27));
	         li.add(new Integer(27));
	 
	         System.out.println(li.get(0) == li.get(1));
	         System.out.println(li.get(2) == li.get(3));
		
		  String[][] arr3 = { { "7", "6", "5" }, { "4", "3" }, { "2", "1" } };
	        for (int i = 0; i < arr3.length; i++) { //Line n1
	            for (int j = 0; j < arr3[i].length; j++) { //Line n2
	                switch (arr3[i][j]) { //Line n3
	                    case "2":
	                    case "4":
	                    case "6":
	                        break; //Line n4
	                    default: 
	                        continue; //Line n5
	                }
	                System.out.print(arr3[i][j]); //Line n6
	            }
	        }
		
		 List<String> dryFruits = new ArrayList<>();
         dryFruits.add("Walnut");
         dryFruits.add("Apricot");
         dryFruits.add("Almond");
         dryFruits.add("Date");
 
         ListIterator<String> iterator = dryFruits.listIterator();
         while(iterator.hasNext()) {
             if(iterator.next().startsWith("A")) {
                 iterator.remove();
              }
         }
 
         System.out.println(dryFruits);
		
		 List<String> list6 = new ArrayList<>();
		 list6.add(null);
		 list6.add(null);
		 list6.add(null);
	        System.out.println(list6.remove(0) + ":" + list6.remove(null));
		
		  int grade = 75;
	         if(grade > 60) {
	             System.out.println("Congratulations");
	             System.out.println("You passed");
	         }
	         else
	             System.out.println("You failed");
		
		 List<StringBuilder> days = new ArrayList<>();
         days.add(new StringBuilder("Sunday"));
         days.add(new StringBuilder("Monday"));
         days.add(new StringBuilder("Tuesday"));
 
         if(days.contains(new StringBuilder("Sunday"))) {
             days.add(new StringBuilder("Wednesday"));
         }
 
         System.out.println(days.size());
		
		String str1 = " ";
        boolean b1 = str1.isEmpty();
        System.out.println(b1);
        str1.trim();
        b1 = str1.isEmpty();
        System.out.println(b1);
		
		  System.out.println(new Boolean("ture"));
		  StringBuilder sb1 = new StringBuilder("Java");
	         String s1 = sb1.toString();
	         String s2 = "Java";
	 
	         System.out.println(s1 == s2);
	         
	         int a = 2;
	         boolean res = false;
	         res = a++ == 2 || --a == 2 && --a == 2;
	         System.out.println("the value of a is " +a);
	         
		  int [] arr = {3, 2, 1};
	         for(int i : arr) {
	             System.out.println(i);
	         }
	         
	         System.out.println(args.length);

	         List<String> list = new ArrayList<>();
	         list.add("X");
	         list.add("Y");
	         list.add("X");
	         list.add("Y");
	         list.add("Z");
	         list.remove(new String("Y"));
	         System.out.println(list);
	         
	         String [] arr1 = new String[7];
	         System.out.println(arr1);
	         
	         List<Integer> list1 = new ArrayList<>();
	         list1.add(100);
	         list1.add(200);
	         list1.add(100);
	         list1.add(200);
	         list1.remove(new Integer(100));
	 
	         System.out.println(list1);
	         
	         StringBuilder sb = new StringBuilder("Hurrah! I Passed...");
	         sb.delete(0, 100);
	         System.out.println(sb.length());
	         
	         
	         LocalDate d1 = LocalDate.parse("1999-09-09");
	         LocalDate d2 = LocalDate.parse("1999-09-09");
	         LocalDate d3 = LocalDate.of(1999, 9, 9);
	         LocalDate d4 = LocalDate.of(1999, 9, 9);
	         System.out.println((d1 == d2) + ":" + (d2 == d3) + ":" + (d3 == d4));
	         
	         char c = 'Z';
	         long l = 100_00l;
	         int i = 9_2;
	         float f = 2.02f; 
	         double d = 10_0.35d;
	         l = c + i;
	         f = c * l * i * f;
	         f = l + i + c;
	         i = (int)d;
	         f = (long)d;
	         
	}

}
