package cn.itcast_02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket datagramSocket = new DatagramSocket();
		byte[] b = "LpplWjj".getBytes();
		DatagramPacket datagramPacket = new DatagramPacket(b, b.length, InetAddress.getByName("192.168.1.192"), 12345);
		datagramSocket.send(datagramPacket);
		datagramSocket.close();
	}
}
