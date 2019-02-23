package cn.itcast_01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket datagramSocket = new DatagramSocket(10011);
		byte[] buf = new byte[1024];
		int length = buf.length;
		DatagramPacket datagramPacket = new DatagramPacket(buf, length);
		datagramSocket.receive(datagramPacket);
		InetAddress ia = datagramPacket.getAddress();
		String s = ia.getHostAddress();
		byte[] bb = datagramPacket.getData();
		int len = datagramPacket.getLength();
		String ss = new String(bb, 0, len);
		System.out.println(s + "    " + ss);

	}
}
