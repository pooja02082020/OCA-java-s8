public class VariablesAnsScopes {
    public static void main(String[] args) {
    }

    public void eat(int piecesOfCheese){
        int bitesOfCheese = 1;
    }

    public void eatIfHungry(boolean hungry){
        if (hungry){
            int bitesOfCheese = 1;
        }
       // System.out.println(bitesOfCheese);   bitesOfCheese goes out of scope
        System.out.println(hungry);

        {
            boolean teenyBit = true;
            System.out.println(hungry);
        }

//        {  boolean yes =false;}
//        System.out.println(yes);
    }

}
