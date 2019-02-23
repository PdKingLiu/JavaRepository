package cn.FieldDemo_02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;


public class Demo1 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("cn.FieldDemo_02.Person");
		Constructor cs = c.getConstructor();
		Person p = (Person) cs.newInstance();
		Field f = c.getField("address");
		f.set(p, "xiyou");
		System.out.println(p);
		Field f2 = c.getDeclaredField("name");
		f2.setAccessible(true);
		f2.set(p, "Lpp");
		System.out.println(p);
		Field f3 = c.getDeclaredField("age");
		f3.set(p, 19);
		System.out.println(p);
	}
}