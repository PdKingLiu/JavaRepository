package cn.Lock;

import cn.Mocies_2.MyRunnable;

public class DemoLockDemo {
	public static void main(String[] args) {
		DieLock dtrue = new DieLock(true);
		DieLock dfalse = new DieLock(false);

		MyRunnable myRunnable = new MyRunnable();
		dfalse.start();
		dtrue.start();
	}
}
