package com.hello;

import java.util.Scanner;

public class scan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		if (sc.hasNextInt()) {
			System.out.println("Y");
		} else {
			System.out.println("N");
		}

		int a = sc.nextInt();
		String string = sc.nextLine();
		System.out.println(a + string);
	}
}
