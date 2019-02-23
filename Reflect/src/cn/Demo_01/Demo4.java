package cn.Demo_01;

import java.lang.reflect.Constructor;

public class Demo4 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("cn.Demo_01.Person");
		Constructor cc = c.getDeclaredConstructor(String.class);
		
		cc.setAccessible(true);
		Person p = (Person) cc.newInstance("Lpp");
		System.out.println(p);
	}
}
