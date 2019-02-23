package jihe;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Random r = new Random();
		int count = 0;
		while (count < 10) {
			int n = r.nextInt(10);
			if (!arr.contains(n)) {
				arr.add(n);
				count++;
			}
		}
		for (Integer i : arr) {
			System.out.println(i);
		}
		ArrayList<Integer> arr3 = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("ÇëÊäÈëÊı¾İ(!=0)£º");
			int a = sc.nextInt();
			if (a != 0) {
				arr3.add(a);
			} else
				break;
		}
		Integer[] i2 = new Integer[arr3.size()];
		arr3.toArray(i2);
		for (Integer a : i2) {
			System.out.println(a);
		}
	}

}
