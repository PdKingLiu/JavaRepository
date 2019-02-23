package cn.Demo_01;

import java.lang.reflect.Constructor;

public class Demo2 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("cn.Demo_01.Person");
		Constructor[] cons = c.getDeclaredConstructors();
		// System.out.println(cons);
		for (Constructor constructor : cons) {
			System.out.println(constructor);
		}
		Constructor cc = c.getConstructor();
		Object obj = cc.newInstance();
		System.out.println(obj);
		Person pp = (Person)obj;
		
		System.out.println(pp);

	}
}
