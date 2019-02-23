package cn.FieldDemo_04;

public class Person {
	private String name;
	int age;
	public String address;

	public Person() {
	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	private Person(String name) {
		this.name = name;
	}

	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void show() {
		System.out.println("show");
	}

	public String method(String s, int i) {
		return s + i;
	}

	private void fun() {
		System.out.println("fun");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

}