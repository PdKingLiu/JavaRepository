package cn.FieldDemo_02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Demo2 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("cn.FieldDemo_02.Person");
		// Method[] methods = c.getDeclaredMethods();
		// for (Method method : methods) {
		// System.out.println(method);
		// }
		Constructor cc = c.getConstructor();
		Person p = (Person) cc.newInstance();
		Method m1 = c.getDeclaredMethod("show");
		m1.invoke(p);
		Method m2 = c.getMethod("method", String.class, int.class);
		System.out.println(m2.invoke(p, "One ", 1));
		Method m3 = c.getDeclaredMethod("fun");
		m3.setAccessible(true);
		m3.invoke(p);
	}
}
