package cn.Lock;

public class DieLock extends Thread {
	private boolean f;

	public DieLock(boolean f) {
		this.f = f;
	}

	@Override
	public void run() {
		if (f) {
			synchronized (MyLock.objA) {
				System.out.println("if objA");
				synchronized (MyLock.objB) {
					System.out.println("if objB");
				}
			}
		} else {
			synchronized (MyLock.objB) {
				System.out.println("if objB");
				synchronized (MyLock.objA) {
					System.out.println("if objA");
				}
			}
		}
	}

}
