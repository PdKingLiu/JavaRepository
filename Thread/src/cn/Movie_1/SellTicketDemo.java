package cn.Movie_1;

public class SellTicketDemo {
	public static void main(String[] args) {
		SellTicket sellTicket = new SellTicket();
		SellTicket sellTicket2 = new SellTicket();
		SellTicket sellTicket3 = new SellTicket();

		sellTicket.start();
		sellTicket2.start();
		sellTicket3.start();
	}
}
