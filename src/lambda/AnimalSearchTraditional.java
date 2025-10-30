package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AnimalSearchTraditional {
	public static void main(String[] args) {
		List<Animal>animals = new ArrayList<>();
		animals.add(new Animal("fish",false,true));
		animals.add(new Animal("Kangaroo",true,false));
		animals.add(new Animal("rabbit",true,false));
		 animals.add(new Animal("penguin",true,true));
		
		//print(animals,new CheckIfHopper());
		//Parent p = new child();
		print(animals, a-> a.canSwim());
	}
	
	private static void print(List<Animal>animals,Predicate<Animal> checker) {
		for(Animal animal: animals) {
			if(checker.test(animal)) {
				System.out.println(animal+" ");
			}
		}
		
	}
}
