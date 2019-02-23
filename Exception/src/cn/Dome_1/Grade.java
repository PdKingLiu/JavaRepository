package cn.Dome_1;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Teacher t = new Teacher();
		int a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		try {
			t.check(a);
		} catch (MyException e) {
			e.printStackTrace();
		}

	}

}
