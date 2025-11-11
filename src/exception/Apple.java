package exception;

public class Apple {
    public String color;

    public Apple(String color) {
       color =color;
    }

    public static void main(String [] args) {
        Apple apple = new Apple("GREEN");
        System.out.println(apple.color);
    }
}