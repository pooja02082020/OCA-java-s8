package methods;

public class TooManyConversions {

	public static void play(Long l) {

	}

	public static void play(Long... l) {

	}
	
	public static void main(String[] args) {
		//play(4); //autoboxing only works within the same primitive-wrapper pair
		play(4L);  //cannot converted in two steps
	}
}
