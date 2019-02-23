package newcala.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Newc {

	public static void main(String[] args) {
		int[] arr2 = { 1, 2, 3, 4, 65, 6, 78, 5, 89 };
		int a = 1;
		int b = 2;
		int d = a + b;
		for (int i : arr2) {
			System.out.print(i + " ");
		}
		System.out.println();
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("1");
		ar.add("1");
		ar.add("1");
		for (String string : ar) {
			System.out.print(string + " ");
		}
		String[] s = { "1", "2", "3" };
		List<String> list = Arrays.asList(s);

		System.out.println(list.toString());
		ArrayList arr = new ArrayList();
		arr.add(arr);
		System.out.println(arr);
	}

}
