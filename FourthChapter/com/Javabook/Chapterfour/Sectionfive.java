package com.Javabook.Chapterfour;
import java.util.*;
class Fraction {
	double up;
	double down;
	Fraction () {}
	Fraction (double up,double down) {
		this.up=up;
		this.down=down;
	}
	public static double Mul(Fraction a,Fraction b) {
		double result;
		result = (a.up*b.up)/(a.down*b.down);
		return result;
	}
}
public class Sectionfive {

	public static void main(String[] args) {
		double a,b,c,d;
		Scanner sc = new Scanner(System.in);
		System.out.print("输入第一个分数的分子分母：");
		a = sc.nextDouble();
		b = sc.nextDouble();
		System.out.print("输入第二个分数的分子分母：");
		c = sc.nextDouble();
		d = sc.nextDouble();
		sc.close();
		Fraction f1 = new Fraction(a,b);
		Fraction f2 = new Fraction(c,d);
		System.out.println("乘积是："+Fraction.Mul(f1,f2));
	}

}
