package cn.itcast_04;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveThread implements Runnable {
	DatagramSocket a = null;

	public ReceiveThread(DatagramSocket d) {
		this.a = d;
	}

	@Override
	public void run() {
		try {
			while (true) {
				byte[] b = new byte[1024];
				DatagramPacket datagramPacket = new DatagramPacket(b, b.length);
				a.receive(datagramPacket);
				String s = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
				String ip = datagramPacket.getAddress().getHostAddress();
				System.out.println(ip + " -> " + s);
			}
		} catch (Exception e) {

		}
	}
}
