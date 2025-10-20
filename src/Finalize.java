import java.util.ArrayList;
import java.util.List;

public class Finalize {
	
	private static List objects = new ArrayList();
	
	protected void finalize() {
		objects.add(this); // static variable only runs till the program ends --DONOT DO THIS 
		System.out.println("Calling Finalize");
	}

	public static void main(String[] args) {
		Finalize f = new Finalize();

	}

}
