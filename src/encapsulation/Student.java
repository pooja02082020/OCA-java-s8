package encapsulation;

public class Student {
 
	private int marks;
	 //datatype getVariableName, setVariableName(value)
	//setBooleanVariableName  -for boolean  , isBooleanVariableName
	
	public int getMarks() {
		return this.marks;
	}
	
	public void setMarks(int marks) {
		if(marks>=0 &&  marks<=100)
		{
			this.marks =marks;
		}
		else {
			System.out.println("Please enter a valid marks");
		}
	}
}
