package cn.itcast_04;

import java.io.IOException;
import java.net.DatagramSocket;

public class Room {
	public static void main(String[] args) throws IOException{
		DatagramSocket daSend = new DatagramSocket();
		DatagramSocket daReceive = new DatagramSocket(12345);
		
		SendThread st = new SendThread(daSend);
		ReceiveThread rt = new ReceiveThread(daReceive);
		
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(rt);
		
		t1.start();
		t2.start();
	}
}
