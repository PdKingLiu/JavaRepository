package cn.SellPlus;

public class GetPerson implements Runnable {
	private Person p;
	Object obj = new Object();

	public GetPerson(Person p) {
		this.p = p;
	}

	@Override
	public void run() {
		while (true) {
			p.get();
			
		}
	}
}
