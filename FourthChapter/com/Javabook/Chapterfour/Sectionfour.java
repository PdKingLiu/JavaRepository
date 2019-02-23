package com.Javabook.Chapterfour;
class Point {
	double x,y;
	Point(double x,double y){
		this.x = x;
		this.y = y;
	}
}
class Line {
	Point a,b;
	Line() {}
	Line(Point a,Point b){
		this.a=a;
		this.b=b;
	}
	public double length () {
		double Len;
		Len = Math.sqrt(Math.pow((a.x-b.x),2)+Math.pow((a.y-b.y),2));
		return Len;
	}
	public boolean Flat () {
		if(a.y==b.y)
			return true;
		else
			return false;
	}
	public double Slope () {
		double slope;
		slope = (a.y-b.y)/(a.x-b.x);
		return slope;
	}
	public Point mid () {
		double x1;
		double y1;
		x1=(a.x+b.x)/2;
		y1=(a.y+b.y)/2;
		Point p=new Point(x1,y1);
		return p;
	}
}
public class Sectionfour {
	public static void main(String[] args) {
		Point D1 = new Point(1,2);
		Point D2 = new Point(2,4);
		Line lin1 = new Line(D1,D2);
		Point D3 = new Point(-2,4);
		Point D4 = new Point(-3,2);
		Line lin2 = new Line(D3,D4);
		Point D15 = lin1.mid();
		Point D35 = lin2.mid();
		System.out.println("����(1,2) (2,4) ��ɵ��߶�:");
		if(lin1.Flat())
			System.out.println("��X��ƽ��");
		else
			System.out.println("��X�᲻ƽ��");
		System.out.println("�е��ǣ�("+D15.x+","+D15.y+")");
		System.out.println("���ȣ�"+lin1.length());
		System.out.println("б�ʣ�"+lin1.Slope());
		
		System.out.println("����(-2,4) (-3,2) ��ɵ��߶�:");
		if(lin2.Flat())
			System.out.println("��X��ƽ��");
		else
			System.out.println("��X�᲻ƽ��");
		System.out.println("�е��ǣ�("+D35.x+","+D35.y+")");
		System.out.println("���ȣ�"+lin2.length());
		System.out.println("б�ʣ�"+lin2.Slope());
		
		if(Vert(lin1,lin2))
			System.out.println("��ֱ�ߴ�ֱ");
		else
			System.out.println("��ֱ�߲���ֱ");
		
		if(Equal(lin1,lin2))
			System.out.println("���߶γ������");
		else
			System.out.println("���߶γ��Ȳ����");
	}
	public static boolean Vert (Line l1,Line l2) {
		if(l1.Slope()*l2.Slope()==-1)
			return true;
		else
			return false;
	}
	public static boolean Equal(Line l1,Line l2) {
		if(l1.length()==l2.length())
			return true;
		else
			return false;
	}
}
