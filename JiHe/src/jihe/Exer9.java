package jihe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Exer9 {
	public static void main(String[] args) {
		HashMap<Integer, String> hp = new HashMap<Integer, String>();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		String[] colors = { "♣", "❤", "◆", "♠" };
		String[] numbers = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2" };
		int i = 0;
		for (String s : numbers) {
			for (String ss : colors) {
				String sss = ss.concat(s);
				hp.put(i, sss);
				arr.add(i);
				i++;
			}
		}
		hp.put(i, "小王");
		arr.add(i);
		i++;
		hp.put(i, "大王");
		arr.add(i);
		Collections.shuffle(arr);
		TreeSet<Integer> one = new TreeSet<Integer>();
		TreeSet<Integer> two = new TreeSet<Integer>();
		TreeSet<Integer> three = new TreeSet<Integer>();
		TreeSet<Integer> dipai = new TreeSet<Integer>();
		for (int m = 0; m < arr.size(); m++) {
			if (m >= hp.size() - 3) {
				dipai.add(arr.get(m));
			} else if (m % 3 == 0) {
				one.add(arr.get(m));
			} else if (m % 3 == 1) {
				two.add(arr.get(m));
			} else if (m % 3 == 2) {
				three.add(arr.get(m));
			}
		}
		Look("one  ", one, hp);
		Look("two  ", two, hp);
		Look("three", three, hp);
		Look("dipai", dipai, hp);
	}

	public static void Look(String name, TreeSet<Integer> trr, HashMap<Integer, String> hp) {
		System.out.print(name + " : ");
		for (Integer i : trr) {
			String s = hp.get(i);
			System.out.print(s + " ");
		}
		System.out.println();
	}
}
