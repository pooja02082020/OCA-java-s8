package exception;

import java.util.ArrayList;
import java.util.List;
 
public class Test {
     public static void main(String[] args) {
         List<String> list = new ArrayList<>();
         list.add(0, "Array");
         list.set(0, "List");
 
         System.out.println(list);
         
         StringBuilder sb = new StringBuilder(5);
         sb.append("0123456789");
         sb.delete(8, 1000);
         System.out.println(sb);
     }
}