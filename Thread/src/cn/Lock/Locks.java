package cn.Lock;

public class Locks {
	public static void main(String[] args) {

		LockDemo l = new LockDemo();
		Thread t1 = new Thread(l, "´°¿Ú1£º");
		Thread t2 = new Thread(l, "´°¿Ú2£º");
		Thread t3 = new Thread(l, "´°¿Ú3£º");
		t1.start();
		t2.start();
		t3.start();
	}
}
