package cn.itcast_03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket datagramSocket = new DatagramSocket(12346);
		while (true) {
			byte[] b = new byte[1024]; 
			DatagramPacket datagramPacket = new DatagramPacket(b, b.length);
			datagramSocket.receive(datagramPacket);
			String s = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
			String ip = datagramPacket.getAddress().getHostAddress();
			System.out.println(ip + " -> " + s);
		}
	}
}
