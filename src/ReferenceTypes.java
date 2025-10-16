import java.util.Date;

public class ReferenceTypes {
    public static void main(String[] args) {
        Date date;  //reference variable and it can only point to an object
        String name; //String is also reference datatype

        date = new Date();
        name= "Pooja";
        System.out.println(date.getDate()); // we can used to call methods
        System.out.println(name.toUpperCase());  // no methods or variables associated with primitive types just can get value
        date = null;
      //  int value = null; //does not compile

    }
}
