package cn.itcast_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendThread implements Runnable{

	DatagramSocket d=null;
	public SendThread(DatagramSocket a) {
		this.d = a;
	}
	@Override
	public void run() {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		try {
		while ((line=bufferedReader.readLine())!=null) {
			if(line.equals("88")) {
				break;
			}
			byte[] b = line.getBytes();
			DatagramPacket datagramPacket = new DatagramPacket(b, b.length, InetAddress.getByName("192.168.1.255"),
					12345);
			d.send(datagramPacket);
		}
		d.close();
		}catch (IOException e) {

		}
	}

}
