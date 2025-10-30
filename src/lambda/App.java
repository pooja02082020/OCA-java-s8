package lambda;

interface Testable {
    boolean test(int x);
}
public class App {
    public static void main(String[] args) {
        Testable t = x -> x > 0;
        System.out.println(t.test(-1));
    }
}
