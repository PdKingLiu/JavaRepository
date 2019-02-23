package cn.Mocies_2;

public class MyRunnable implements Runnable {

	private static int tickets = 100;
	protected Object obb = new Object();
	int x = 0;

	@Override
	public void run() {
		while (true) {
			if (x % 2 == 0) {
				synchronized (MyRunnable.class) {
					if (tickets > 0) {
						try {
							Thread.sleep(0);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName() + "正在出售第" + (tickets--) + "张票");
					} else {
						Sell();
					}
				}
			}
		}
	}

	private static synchronized void Sell() {
		if (tickets > 0) {
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "正在出售第" + (tickets--) + "张票");
		}
	}

}
