package com.Javabook.ChapterThird;
import java.util.Scanner;
public class SectionThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float max;
		float min;
		float newdate;
		System.out.print("�������أ�");
		newdate = sc.nextFloat();
		max = newdate;
		min = newdate;
		while(newdate > 0) {
			if(newdate > max)
				max = newdate;
			if(newdate < min)
				min = newdate;
			System.out.print("�������أ�");
			newdate = sc.nextFloat();
		}
		System.out.println("��������Ϊ��"+min);
		System.out.println("��������Ϊ��"+max);
		
	}

}
