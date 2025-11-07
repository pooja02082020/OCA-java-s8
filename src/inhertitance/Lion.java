package inhertitance;

public class Lion extends Animal {

	// Is - a relationship

	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("the type of animal is "+ this.type);
	}
	

	public void roar() {
		System.out.println("The lion with name" + this.name + " with age " + this.getAge() + " is going to roar"
				+ " Is TERRESTRIAL ? " +this.isTerristial);
	}
}
