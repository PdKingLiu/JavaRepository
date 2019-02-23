package cn.Mocies_2;

public class SellTickets {

	public static void main(String[] args) {
		MyRunnable my = new MyRunnable();
		Thread t1 = new Thread(my, "One");
		Thread t2 = new Thread(my, "Two");
		Thread t3 = new Thread(my, "Three");
		t1.start();
		t2.start();
		t3.start();
	}

}
