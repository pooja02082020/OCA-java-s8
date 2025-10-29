package methods;

public class PassingData {

	public static void main(String[] args) {
		int x=5;
		change(x);
		System.out.println(x);

		String name ="Pooja";
		StringChange(name);
		System.out.println(name);
		
		 name=StringChangeReturn(name);
		System.out.println(name);
		
		StringBuilder builder = new StringBuilder("Pooja");
		changeStringBuilder(builder);
		System.out.println(builder);
		
		int num=5;
		String letters = "Poo";
		Number(num); //here we didn't reassign the num, so we get origin value 5
		letters = Letters(letters); //we reassign so we get appended letters
		System.out.println(num+letters);
	}
	
	
	static int Number(int n) {
		n++;
		return n;
	}
	
	static String Letters(String lett) {
		lett+="ja";
		return lett;
	}
	static void change(int num) {
		num=10;
	}
	
	static void StringChange(String name) {
		name="Sanjay";
	}


	static String StringChangeReturn(String name) {
		name="Sanjay";
		return name;
	}

	static void changeStringBuilder(StringBuilder p) {
		p.append(" Lohani");  // its same object
	}
}
