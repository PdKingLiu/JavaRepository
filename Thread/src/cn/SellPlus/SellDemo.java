package cn.SellPlus;

public class SellDemo {
	public static void main(String[] args) {
		Person p = new Person();
		
		SetPerson set = new SetPerson(p);
		GetPerson get = new GetPerson(p);
		
		Thread t1 = new Thread(set, "set");
		Thread t2 = new Thread(get, "get");

		t2.start();
		t1.start();
	}
}
