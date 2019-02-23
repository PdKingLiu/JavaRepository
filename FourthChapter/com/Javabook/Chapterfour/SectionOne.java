package com.Javabook.Chapterfour;

class Address {
	String Name;
	String Phone;
	String Email;

	Address() {
	}

	public void Print() {
		System.out.println(Name + "的电话是：" + Phone + "  邮箱是：" + Email);
	}
}

public class SectionOne {

	public static void main(String[] args) {
		Address Stu1 = new Address();
		Address Stu2 = new Address();
		Address Stu3 = new Address();
		Stu1.Name = "刘沛栋";
		Stu1.Phone = "15829217780";
		Stu1.Email = "931942280@qq.com";
		Stu1.Print();
		Stu2.Name = "公安局";
		Stu2.Phone = "110";
		Stu2.Email = "110@qq.com";
		Stu2.Print();
		Stu3.Name = "医院";
		Stu3.Phone = "120";
		Stu3.Email = "120@qq.com";
		Stu3.Print();
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}
	}

}
