package lambda;

import java.time.Period;

interface Testable {
    boolean test(int x);
}
public class App {
    public static void main(String[] args) {
        Testable t = x -> x > 0;
        System.out.println(t.test(-1));
        
        Period period = Period.of(0, 0, 0);
        System.out.println(period);
        
        
//        StringBuilder sb = new StringBuilder("Java");
//        String s1 = sb.toString();
//        String s2 = sb.toString();
//
//        System.out.println(s1 == s2);
        String str = "java";
        StringBuilder sb = new StringBuilder("java");

        System.out.println(str.equals(sb) + ":" + sb.equals(str));
        
        int[] arr = new int[2]; //Line 3
    }
}
