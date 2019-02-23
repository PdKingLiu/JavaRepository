package cn.Sell;

public class SetPerson implements Runnable {

	private Person p;
	int x = 0;
	Object obj = new Object();

	public SetPerson(Person p) {
		this.p = p;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (p) {
				if(p.flag) {
					try {
						p.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if (x % 2 == 0) {
					p.name = "lpp";
					p.age = 19;
				} else {
					p.name = "wjj";
					p.age = 18;
				}
				x++;
				p.flag=true;
				p.notify();
			}
		}

	}

}
