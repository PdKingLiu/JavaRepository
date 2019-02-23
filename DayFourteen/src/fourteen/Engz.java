package fourteen;

import java.sql.Date;
import java.util.Arrays;

public class Engz {

	public static void main(String[] args) {
		String s = "26 53 16 44 72 39";
		String[] a = s.split(" ");
		int[] t = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			t[i] = Integer.parseInt(a[i]);
		}
		Arrays.sort(a);
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < a.length; i++) {
			builder.append(a[i]).append(" ");
		}
		s = builder.toString().trim();
		System.out.println(s);

		String s2 = "oijiko56489pobvmp5787psodk44s8d88d9";
		String s3 = "\\d+";
		String s4 = "*";
		System.out.println(s2.replaceAll(s3, s4));
		System.gc();
		System.out.println(System.currentTimeMillis());
		Date d = new Date(System.currentTimeMillis());
		System.out.println(d);
		int[] a1 = {2,6,3,7,4,8};
		int[] a2 = {11,23,44,32,15};
		System.arraycopy(a1, 1, a2, 4, 2);
		System.out.println(Arrays.toString(a2));
		System.out.println(Arrays.toString(a1));
		
	}

}
