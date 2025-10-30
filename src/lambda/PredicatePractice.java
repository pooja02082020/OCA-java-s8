package lambda;

import java.util.ArrayList;
import java.util.List;

public class PredicatePractice {

	public static void main(String[] args) {
		List<String> bunnies = new ArrayList<>();
		bunnies.add("long ear");
		bunnies.add("floopy");
		bunnies.add("hoppy");
		System.out.println(bunnies);

		bunnies.removeIf(s-> s.charAt(0)!='h');
		System.out.println(bunnies);
	}

}
