public class Swan {

    public Swan(){
        number =5;
    }

    public static void main(String[] args) {
        Swan swan = new Swan();
        System.out.println(swan.number);
    }
    private int number =3;
    {
        number =4;
    }
}
