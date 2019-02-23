package cn.Thread_1;

public class MyThreadDemo {

	public static void main(String[] args) {
		MyThread my1 = new MyThread();
		MyThread my2 = new MyThread();

		my1.setName("wjj");
		my2.setName("lpp");
		// my1.start();
		// my2.start();
		// System.out.println(Thread.currentThread().getName());
		// System.out.println(my1.getPriority());
		// System.out.println(my2.getPriority());
		// my1.setPriority(1);
		// my2.setPriority(1);
		// my1.start();
		// try {
		// my1.join();
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		my2.setDaemon(true);

		my1.start();
		my1.interrupt();
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		try {
//			my1.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		my2.start();

	}

}
