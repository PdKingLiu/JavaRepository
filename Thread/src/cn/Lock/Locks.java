package cn.Lock;

public class Locks {
	public static void main(String[] args) {

		LockDemo l = new LockDemo();
		Thread t1 = new Thread(l, "����1��");
		Thread t2 = new Thread(l, "����2��");
		Thread t3 = new Thread(l, "����3��");
		t1.start();
		t2.start();
		t3.start();
	}
}
