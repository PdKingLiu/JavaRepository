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
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public String toString() {
		return "cat [a=" + a + ", b=" + b + "]";
	}

	public void show() {
		// TODO �Զ����ɵķ������
		System.out.println("c");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO �Զ����ɵķ������
		return super.clone();
	}
}
