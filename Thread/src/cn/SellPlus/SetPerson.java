package cn.SellPlus;

public class SetPerson implements Runnable {

	private Person p;
	int x = 0;

	public SetPerson(Person p) {
		this.p = p;
	}

	@Override
	public void run() {
		while (true) {
			if (x % 2 == 0) {
				p.set("lpp", 19);
			} else {
				p.set("wjj", 18);
			}
			x++;

		}

	}

}
