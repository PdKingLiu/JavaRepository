package com.hello;

public class cat extends animal implements Cloneable {
	int a = 10;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		cat other = (cat) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
	}

	int b = 20;

	public cat() {
		// TODO 自动生成的构造函数存根
	}

	@Override
	public String toString() {
		return "cat [a=" + a + ", b=" + b + "]";
	}

	public void show() {
		// TODO 自动生成的方法存根
		System.out.println("c");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO 自动生成的方法存根
		return super.clone();
	}
}
