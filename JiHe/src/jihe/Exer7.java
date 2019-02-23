package jihe;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Exer7 {
	public static void main(String[] args) {
		TreeMap<Character, Integer> trr = new TreeMap<Character, Integer>();
		System.out.println("ÇëÊäÈë×Ö·û´®£º");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		for (char c : ch) {
			Integer i = trr.get(c);
			if (i == null) {
				trr.put(c, 1);
			} else {
				i++;
				trr.put(c, i);
			}
		}
		StringBuilder sb = new StringBuilder();
		Set<Character> se = trr.keySet();
		for (Character c : se) {
			Integer ii = trr.get(c);
			sb.append(c).append("(").append(ii).append(")");
		}
		String sss = sb.toString();
		System.out.println(sss);
	}
}
