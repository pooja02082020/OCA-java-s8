package Arrays;

import java.util.Arrays;

public class ArraysMulti {

	public static void main(String[] args) {
		// initializations of 2d arrays
		int[][] vars1;
		int vars2[][];
		int[] vars3[];
		int[] vars4[], vars5[];
		int[] vars6, vars7[][];

		String[][] rectangle = new String[3][2];
		rectangle[0] = new String[] { "Pooja", "Priya" };
		rectangle[1] = new String[] { "Shreya", "Kitit" };
		rectangle[2] = new String[] { "Sanj", "Panj" };

		System.out.println(rectangle[2][0]);
		System.out.println(rectangle.length);
		System.out.println(Arrays.toString(rectangle[2]));
		System.out.println(Arrays.deepToString(rectangle));

		for (int i = 0; i < rectangle.length; i++) {
			for (int j = 0; j < rectangle[0].length; j++) {
				System.out.print(rectangle[i][j] + "\t");

			}
			System.out.println();
		}

		for (String[] n : rectangle) {
			for (String innerElement : n) {

				System.out.print(innerElement + "\t");

			}
			System.out.println();
		}

	}
}
