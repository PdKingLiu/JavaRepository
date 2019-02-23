package com.Javabook.Chapterfour;
class Uear {
	String name;
	String password;
	static int number;
	public Uear() {
		number++;
	}
	public Uear(String name) {
		this.name=name;
		number++;
	}
	public Uear(String name,String password) {
		this.name=name;
		this.password=password;
		number++;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setPassword(String Password) {
		this.password=Password;
	}
	public void print() {
		System.out.println(name+"的密码是："+password);
	}
}
public class Sectionseven {
	public static void main (String[] args) {
		Uear u1 = new Uear("刘沛栋");
		u1.setPassword("159152");
		Uear u2 =new Uear();
		u2.setName("乌靖");
		u2.setPassword("152293");
		Uear u3 = new Uear("张三","152159");
		u1.print();
		u2.print();
		u3.print();
		System.out.println("用户个数："+Uear.number);	
	}
}
