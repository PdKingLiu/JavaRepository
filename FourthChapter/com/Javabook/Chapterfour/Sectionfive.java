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
		System.out.print("�����һ�������ķ��ӷ�ĸ��");
		a = sc.nextDouble();
		b = sc.nextDouble();
		System.out.print("����ڶ��������ķ��ӷ�ĸ��");
		c = sc.nextDouble();
		d = sc.nextDouble();
		sc.close();
		Fraction f1 = new Fraction(a,b);
		Fraction f2 = new Fraction(c,d);
		System.out.println("�˻��ǣ�"+Fraction.Mul(f1,f2));
	}

}
