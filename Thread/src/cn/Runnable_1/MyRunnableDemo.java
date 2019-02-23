package cn.Runnable_1;

public class MyRunnableDemo {
	public static void main(String[] args) {
		MyRunnable my = new MyRunnable();
		Thread t1 = new Thread(my,"lpp");
		Thread t2 = new Thread(my,"wjj");
		
		t1.start();
		t2.start();
	}
}
