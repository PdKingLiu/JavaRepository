package cn.Sell;

public class GetPerson implements Runnable {
	private Person p;
	Object obj = new Object();

	public GetPerson(Person p) {
		this.p = p;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (p) {
				if (!p.flag) {
					try {
						p.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(p.name + "-" + p.age);
				p.flag = false;
				p.notify();
			}
		}
	}
}
