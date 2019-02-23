package com.Javabook.ChapterThird;

import com.hello.cat;

public class SectionOne {

	public static void main(String[] args) {
		for (int i = 2; i <= 100; i++) {
			int tem = 0;

			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					tem = 1;
			}
			if (tem == 0)
				System.out.print(i + " ");
		}
		cat c = new cat();
	}
}