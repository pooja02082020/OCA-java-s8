package Arrays;

import java.util.Arrays;

public class ArrayOneD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers[] = new int[10];

		int[] numbers2 = new int[] { 40, 50, 60 };

		int[] numbers3 = { 1, 2, 3 };

		int[] ids, types;
		// two variables of integer arrays will be created
		int id1[], type1;

		// 1 vaialbe of 1 int array and 1 integer primitive datatype
		String[] names = { "Pooja", "ABC", "Priya" };
		String[] alias = names;
		System.out.println(names.equals(alias)); // true because of reference euality
		System.out.println(names.toString());

		// hashcode of particular class

		String[] names1 = { "Pooja", "ABC", "Priya" };
		String[] alias1 = { "Pooja", "ABC", "Priya" }; // new array with same contents

		System.out.println(names1.equals(alias1)); // this will be false

		// Casting in Array
		String[] strings = { "abcs" };
		Object[] objects = strings; // an array of object can hold a string
		String[] againstrings = (String[]) objects;
		System.out.println(objects);
		System.out.println(againstrings);

		System.out.println(Arrays.toString(objects));
		System.out.println(Arrays.toString(againstrings));

//	againstrings[0]=new StringBuilder();	 //cannot convert from stringbuilder to string
//	objects[0] = new StringBuilder(); //careful--java.lang.ArrayStoreException during run time

		System.out.println(numbers2.length);
		System.out.println(numbers2[1]);

		// for(int i=0;i<=numbers.length;i++) { //index bound exception
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 5;
		}
		System.out.println(Arrays.toString(numbers));

		//Sorting in Array
		int sortNumbers[] = {4,7,6};
//		Arrays.sort(sortNumbers);
		Arrays.sort(sortNumbers,1,3);
		System.out.println(Arrays.toString(sortNumbers));
		
		
		String[] strings1 = {"10","9","100"};
		//if you sort strings, it sorts in lexographical ways which character comes first
		Arrays.sort(strings1);
		System.out.println(Arrays.toString(strings1));
		
		//Searching in java through binary search technique
	 
		int[] numbers5 = {4,2,5,7,9};
		System.out.println(Arrays.binarySearch(numbers5,5));
		System.out.println(Arrays.binarySearch(numbers5,8)); //-1
		
		varArgsExample(3,6,7,6); 
		
	}
	
	static void varArgsExample(int...x) {
		System.out.println(x[0]+x[1]+x[3]);
		
	}

}
