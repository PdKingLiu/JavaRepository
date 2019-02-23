package cn.Movie_1;

public class SellTicket extends Thread {
	static int tickets = 100;

	@Override
	public void run() {
		while (true) {
			if (tickets > 0) {
				System.out.println(getName() + "正在出售第" + (tickets--) + "张票");
			}
		}
	}
}
