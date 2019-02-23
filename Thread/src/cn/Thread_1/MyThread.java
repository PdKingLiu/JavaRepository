package cn.Thread_1;

public class MyThread extends Thread {

	public MyThread(String name) {
		super(name);
	}

	public MyThread() {
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName() + ":" + i);
			// try {
//			 sleep(100);
			// } catch (InterruptedException e) {
			// e.printStackTrace();
			// }
			// yield();
		}
	}
}
