package encapsulation;

public class Tester {

	public static void main(String[] args) {
		Student std = new Student();
		std.setMarks(32);
		System.out.println(std.getMarks());
		
		ImmutableStudent student = new ImmutableStudent(50);
		System.out.println(student.getMarks());
		
		StringBuilder sb = new StringBuilder("initial");
		NonImmutableClass problem = new NonImmutableClass(sb);
		sb.append("final");
		System.out.println(problem.getBuilder());
		sb.append("mee");
		System.out.println(problem.getBuilder());
	}

}
