package lambda;

@FunctionalInterface
public interface CheckTrait {

	boolean test(Animal a); 
	//abstract keyword is not necessary in interface
	//functional interface -one interface can have only one abstract method
}
