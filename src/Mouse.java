public class Mouse {

    static int MAX_LENGTH = 5; // class variable
    int length;  //instance variable

    public void grow(int inches){
        if (length<MAX_LENGTH){
            int newsize = length+inches;
            length = newsize;
        }
    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse();

    }
}
