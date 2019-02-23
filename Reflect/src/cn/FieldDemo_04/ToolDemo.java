package cn.FieldDemo_04;

public class ToolDemo {
	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Person p = new Person();
		Tool.setProperty(p, "name", "Lpp");
		Tool.setProperty(p, "age", 19);
		Tool.setProperty(p, "address", "xiyou");
		System.out.println(p);
	}
}
