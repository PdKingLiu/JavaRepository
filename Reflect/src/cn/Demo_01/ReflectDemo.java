package cn.Demo_01;

public class ReflectDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		Person p = new Person();
		Class c1 = p.getClass();
		Class c2 = Person.class;
		Class c = Class.forName("cn.Demo_01.Person");
		System.out.println(c == c1);
		System.out.println(c == c2);
	}
}
