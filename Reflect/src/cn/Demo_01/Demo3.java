package cn.Demo_01;

import java.lang.reflect.Constructor;

public class Demo3 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("cn.Demo_01.Person");
		Constructor cs = c.getConstructor(String.class, int.class, String.class);
		Person p = (Person) cs.newInstance("lpp", 19, "JJ");
		System.out.println(p);
	}
}
