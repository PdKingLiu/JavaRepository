package com.Javabook.ChapterThird;
import java.util.Scanner;
public class SectionThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float max;
		float min;
		float newdate;
		System.out.print("输入体重：");
		newdate = sc.nextFloat();
		max = newdate;
		min = newdate;
		while(newdate > 0) {
			if(newdate > max)
				max = newdate;
			if(newdate < min)
				min = newdate;
			System.out.print("输入体重：");
			newdate = sc.nextFloat();
		}
		System.out.println("最轻体重为："+min);
		System.out.println("最重体重为："+max);
		
	}

}
