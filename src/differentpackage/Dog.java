package differentpackage;

import inhertitance.Animal;

public class Dog extends Animal{

	public void display() {
		//System.out.println(this.age);  -age is private not accessible
		System.out.println(this.isTerristial);
	}
	
}
