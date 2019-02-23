package cn.ThreadGroup_1;

public class ThreadGroup_1 {
	public static void main(String[] args) {

		ThreadGroup tg = new ThreadGroup("线程组");
		MyRunnable mr = new MyRunnable();
		Thread t1 = new Thread(tg, mr, "窗口一");
		Thread t2 = new Thread(tg, mr, "窗口一");
		ThreadGroup tg2 = t1.getThreadGroup();
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t2.getThreadGroup().getName());
		System.out.println(Thread.currentThread().getName());
	}
}