public class Variables {

    static int z=100; //it is a static variable and its shared among objects

    public int notValid(){
        int x=10;
        int y=9;
        int sum = x+y;
        return sum;
    }

    public static void main(String[] args) {

        Variables obj = new Variables();
        int result = obj.notValid();
        System.out.println(result);

        String zooName;
        int noAnimals;

        zooName= "Jwalakhel";
        noAnimals = 200;

        int x = 10;
        String s1,s2;
        String s3 = "yes" , s4="no";

        int i1, i2, i3=0; //3 variables declared, 1 initialized

        double d1,d2; //double d1,double d2 does not compile
        int i5 ; int i4;  // int i5 ; i4;  does not compile

        int okIdentifier;
        int $OKIdentifier;
        int _alsoOkIdentifier;
        int __SStillOkbutKnotGood$;

//int 3DPointClass;
//int hollywood@vine;
//int *$coffee;
//int public;


    }
}
