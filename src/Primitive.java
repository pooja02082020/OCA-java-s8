public class Primitive {
    public static void main(String[] args) {
        int num=10;
        System.out.println(Integer.MAX_VALUE);
        //Every numeric data is trated as integer first so we need to add L or F after the number

        long max= 434546545456L;
        int b= 0xFF;
        System.out.println(56);
        System.out.println(0b11);
        System.out.println(017);
        System.out.println(0x1F);

        int million1 = 1_000_000;
        int million2 = 1000000;

       // double notAtStart = _1000.00;  doesnot compile if _ is on the 1st and last of the number
        //double decimal1 = 1_.01;  double d2 = 1. _01;  does not compile before and after the decimals as well
    }
}
