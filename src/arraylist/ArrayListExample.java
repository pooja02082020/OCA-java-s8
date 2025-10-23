package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		//how to create an arraylist: 
		//array list is pure oop
		//wrapper class- wrapper of primitive data type
		ArrayList<Integer> list1= new ArrayList<>();
		ArrayList<Integer> list2= new ArrayList<>(10);
		ArrayList<Integer> list3= new ArrayList<>(list2);
		
		List<Integer>parent = new ArrayList<>();
		
		//using an arraylist
		boolean b = list1.add(120); 
		list1.add(20);
		list1.add(12);
		System.out.println(b);
		
		list1.add(0,10);
		System.out.println(list1 );
		
		ArrayList plainoldArrayList =new ArrayList();
		plainoldArrayList.add("pooja");
		plainoldArrayList.add(12);
		plainoldArrayList.add(true);
		System.out.println(plainoldArrayList);
		//you donot have track of datatype we used --we can't to add .subtract on these datatype
		
		//boolean remove(onbject object)
		//boolean remove (int index);
		
		list1.remove(1);
		System.out.println(list1);
		//list1.remove(20); //boolean remove(int index) is invoked so indexoutofboundsexcpetion will be displayed in the console
		list1.remove(new Integer(20));
		System.out.println(list1);
		
		//set method(index, E new Element)
		list1.set(0, 6);
		System.out.println(list1); //[6,12]
		
		System.out.println(list1.size()); //2 
		
		System.out.println(list1.isEmpty()); //false if the list is not empty
		
		
		//clear method
		List<String>birds =new ArrayList<String>();
	birds.add("Parrot");
	birds.add("hawk");
	System.out.println(birds.isEmpty());
	System.out.println(birds.size());
	birds.clear();
	System.out.println(birds.isEmpty());
	System.out.println(birds.size());
	System.out.println(birds);
	
	System.out.println("Contains method");
	//contains method  boolean contains(Object obj)
	System.out.println(list1.contains(12)); //its in the list so true
	System.out.println(list1.contains(4)); //false bez its not in the list
	
	//Equals method --same elements in same order
	//boolean equals(object obj)
	System.out.println(".Equals methods");
	List<String> one =new ArrayList<String>();
	List<String> two =new ArrayList<String>();
	System.out.println(one.equals(two));
	one.add("abc");
	System.out.println(one.equals(two));
	
	
	//Objects can hold null
	ArrayList<Integer> heights = new ArrayList<>();
	heights.add(null);
	
	Integer i4=null; //default value of all object is null
	System.out.println(heights.get(0));
	
//	int result = heights.get(0);   primitive int cannot hold null
	Integer result1= heights.get(0); //but wrapper class Integer can hold null
	System.out.println(result1);

	
	//basic for loop
	for(int i=0;i<list1.size();i++) {
		System.out.println(list1.get(i)+" ");
	}
	
	//for each loop:
	for(Integer j:list1) {
		System.out.println(j);
	}
	
	birds.add("dove");
	birds.add("pigeon");
	
	
	//how to create string arrAy from string array list?
	
	Object[] array =birds.toArray();
	System.out.println(Arrays.toString(array));
	
	String birdsArray[] =birds.toArray(new String[0]);
	System.out.println(Arrays.toString(birdsArray));
	
	//we cannot extend the sixe of fixed array  --backed list--fixed size array
	
	String[] birdsA = {"abc","ddd"};
	List<String> birdsBackedList =Arrays.asList(birdsA);
	System.out.println(birdsBackedList.size());
//	birdsBackedList.add("ddds");  --it cannot add becoz it shares same data in memory
	
	birdsBackedList.set(0, "peacock");
	System.out.println(Arrays.toString(birdsA));
	System.out.println(birdsBackedList);
	
	//This will change in both birdsA and birdsBackedList
	
	//asList method also takes varargs as an argument
	
	Arrays.asList(1,3,5,64,34);
	
	//sort
	System.out.println("Sortingg");
	
	List<Integer>asList =Arrays.asList(50,2,45,34,65,78);
	Collections.sort(asList);
	System.out.println(asList);
	
	}

	
}
