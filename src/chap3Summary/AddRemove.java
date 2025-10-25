package chap3Summary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddRemove {

	public static void main(String[] args) {
		ArrayList<Integer>values = new ArrayList<>();
		values.add(4);
		values.add(5);
		values.set(1, 6);
		values.remove(0);
		for(Integer v:values)System.out.println(v);
		
		
		List<Integer>list = Arrays.asList(10,4,-1,5);
		Collections.sort(list);
		Integer array[] = list.toArray(new Integer[4]);
		System.out.println(array[0]);
	
		String [] names = {"abc","cde","pooja"};
	//	List<String>list1 = names.asList();
	//	list1.set(0, "vdf");
		System.out.println(names[0]);
		
		List<String>hex=Arrays.asList("30","8","3A","FF");
		Collections.sort(hex);
		System.out.println(hex);
		int x= Collections.binarySearch(hex, "8");
		int y = Collections.binarySearch(hex, "3A");
		int z= Collections.binarySearch(hex, "4F");
		System.out.println(x+" "+y+ " "+ z);
		
		List<Integer>ages=new ArrayList<Integer>();
		ages.add(Integer.parseInt("5"));
		ages.add(Integer.valueOf("6"));
		ages.add(7);
		//ages.add(null); 
		for(int age:ages)System.out.println(age);
		
		List<String>one=new ArrayList<String>();
		one.add("abc");
		List<String>two=new ArrayList<String>();
		two.add("abc");
		if(one==two) 
			System.out.println("A");
		else if(one.equals(two))
			System.out.println("B");
		else
			System.out.println("c");
		
			

	}

}
