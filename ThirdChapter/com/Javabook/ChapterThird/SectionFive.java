package com.Javabook.ChapterThird;
import java.util.*;
//import java.math.*;
/*
 * ���һԪ���η��̵�ʵ����
*/
public class SectionFive {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		float a;
		float b;
		float c;
		float dt;
		System.out.print("�����������ϵ����");
		a = sc.nextFloat();
		System.out.print("������һ����ϵ����");
		b = sc.nextFloat();
		System.out.print("�����볣����ϵ����");
		c = sc.nextFloat();
		sc.close();

		dt = b*b - 4*a*c;
		if(dt < 0) {
			System.out.println("��ʵ����");
			return;
		}
		dt = (float)Math.sqrt(dt);
		float x1 = (-b + dt)/(2*a);
		float x2 = (-b - dt)/(2*a);
		System.out.println("�������ֱ��ǣ�x1 = "+x1+" , x2 = "+x2);
		//sc.close();
	}
}
