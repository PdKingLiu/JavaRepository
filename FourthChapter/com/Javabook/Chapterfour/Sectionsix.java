package com.Javabook.Chapterfour;
class rec {
	int length;
	int width;
	public rec(){
		this.length = 1;
		this.width = 1;
	}
	public rec (int length,int width) {
		this.length = length;
		this.width = width;
	}
	public rec (rec r) {
		this.length = r.length;
		this.width = r.width;
	}
	public double getArea() {
		return length*width;
	}
	public double getPer() {
		return (length+width)*2;
	}
	public int getWidth() {
		return this.width;
	}
	public int getLength() {
		return this.length;
	}
	public String toString() {
		String a = "矩形("+length+","+width+")";
		return a;
	}
	public boolean equals(rec r) {
		if(this.length==r.length && this.width==r.width)
			return true;
		else
			return false;
	}
}
public class Sectionsix {

	public static void main(String[] args) {
		rec r1 = new rec(3,4);
		rec r2 = new rec(3,4);
		System.out.println(r1.toString());
		System.out.println("面积是："+r1.getArea());
		System.out.println("周长是："+r1.getPer());
		
		System.out.println(r2.toString());
		System.out.println("面积是："+r2.getArea());
		System.out.println("周长是："+r2.getPer());
		if(r1.equals(r2))
			System.out.println("两矩形相等");
		else
			System.out.println("两矩形不相等");
	}
}
