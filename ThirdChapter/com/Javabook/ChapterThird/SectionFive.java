package com.Javabook.ChapterThird;
import java.util.*;
//import java.math.*;
/*
 * 求解一元二次方程的实数跟
*/
public class SectionFive {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		float a;
		float b;
		float c;
		float dt;
		System.out.print("请输入二次项系数：");
		a = sc.nextFloat();
		System.out.print("请输入一次项系数：");
		b = sc.nextFloat();
		System.out.print("请输入常数项系数：");
		c = sc.nextFloat();
		sc.close();

		dt = b*b - 4*a*c;
		if(dt < 0) {
			System.out.println("无实根！");
			return;
		}
		dt = (float)Math.sqrt(dt);
		float x1 = (-b + dt)/(2*a);
		float x2 = (-b - dt)/(2*a);
		System.out.println("两个跟分别是：x1 = "+x1+" , x2 = "+x2);
		//sc.close();
	}
}
