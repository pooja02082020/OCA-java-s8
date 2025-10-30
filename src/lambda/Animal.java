package lambda;

public class Animal {
	private String species;
	private boolean canHop;
	private boolean canSwim;
	
	public Animal(String specs , boolean canH, boolean canSm) {
		this.species = specs;
		this.canHop = canH;
		this.canSwim = canSm;
	}
	
	public String toString() {
		return species;
	}
	
	public boolean canSwim() {
		return canSwim;
	}
	
	public boolean canHop() {
		return canHop;
	}
}
