package encapsulation;

public class NonImmutableClass {

	private StringBuilder builder;
	
	public NonImmutableClass(StringBuilder b)
{
		//this.builder = b; //to make it immutable we can do 
		this.builder = new StringBuilder(b);
		}
	
	public StringBuilder getBuilder() {
		//return this.builder; //here we can return new StringBuilder
		return new StringBuilder(builder);
		
	}
}
