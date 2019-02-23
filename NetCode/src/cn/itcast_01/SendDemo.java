package cn.itcast_01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket datagramSocket = new DatagramSocket();
		byte[] b = "Lpp".getBytes();
		int l = b.length;
		InetAddress ia = InetAddress.getByName("192.168.1.192");
		int port = 10011;
		DatagramPacket p = new DatagramPacket(b, l, ia, port);
		datagramSocket.send(p);
	}
}
