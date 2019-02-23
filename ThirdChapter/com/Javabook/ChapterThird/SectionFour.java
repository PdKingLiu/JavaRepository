package com.Javabook.ChapterThird;
import java.util.*;
public class SectionFour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Time;
		float Sum = 0;
		float up = 1;
		float down = 1;
		System.out.print("请输入项数：");
		Time = sc.nextInt();
		int n = Time;
		if(Time == 0) {
			System.out.println("0");
		}
		else {
			while(Time != 0) {
				float tem = up;
				up = up + down;
				down = tem;
				Sum += up/down;
				Time -= 1;
			}
		}
		System.out.println("前"+n+"项数和为"+Sum);
	}

}
