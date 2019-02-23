package com.string;

import java.util.Arrays;

public class exercise {

	public static void main(String[] args) {
		System.out.println(fna(new String("abcde")));
		System.out.println(diu(new String("abcba")));
		System.out.println(diu(new String("abcbaa")));
		System.out.println(diu(new String("aaa")));
		int[] a = {6,9,1,23,4};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.binarySearch(a, 4));
		
	}
	
	public static String fna(String str) {
		return new StringBuffer(str).reverse().toString();
	}

	public static boolean diu(String str) {
		return str.equals(new StringBuffer(str).reverse().toString());
	}
}
