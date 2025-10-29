package constructor;

public class Bunny {
	String bunnyName;
	int bunnyAge;
	Bunny(){
		System.out.println("I am a constructor");
	}
	
	public Bunny(String bunnyName,int bunnyAge) {
		System.out.println("I am a parametrized constructor");
//		bunnyName=bunnyName;  //this will give priority to local variable only
//		bunnyAge = bunnyAge; //so this keyword is used which reprents the current instance, the upper/global variable declared above
		this.bunnyName=bunnyName;
		this.bunnyAge=bunnyAge;
		//bunnyAge = this.bunnyAge;  --this assigns global variable to local variable
	}

	public void Bunny() {
		//no returntype in constructor
	}
	
	//public bunny() {
		//lowercase in bunny
	//}
	public static void main(String[] args) {
		Bunny obj= new Bunny();
		Bunny obj2= new Bunny("rabbit",12);
		System.out.println(obj2.bunnyAge);
	}

}
 