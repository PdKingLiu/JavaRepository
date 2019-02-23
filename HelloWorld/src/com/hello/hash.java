package com.hello;

public class hash {

	public static void main(String[] args) throws CloneNotSupportedException {
		cat c = new cat();
		cat c2 = new cat();
		cat c3 = c;
		System.out.println(c.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		Class class1=c.getClass();
		String string = class1.getName();
		System.out.println(string);
		System.out.println(c);
		Object a = c2.clone();
		cat a2 = (cat)a;
		System.out.println(a2);
	}

}
