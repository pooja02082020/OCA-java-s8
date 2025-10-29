package constructor;

public class House {
	 private final String houseName = "House";
	 private final double volume;
	 
	 House(double length,double width,double height){
		 volume = length*width*height;
		 System.out.println("The volume of a hosue is "+volume);
	 }
	 
	 public static void main(String[] args) {
		new House(10,12.4,4);
	}
}
