package cn.itcast_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket datagramSocket = new DatagramSocket();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line=bufferedReader.readLine())!=null) {
			if(line.equals("88")) {
				break;
			}
			byte[] b = line.getBytes();
			DatagramPacket datagramPacket = new DatagramPacket(b, b.length, InetAddress.getByName("192.168.1.255"),
					12346);
			datagramSocket.send(datagramPacket);
		}
		datagramSocket.close();

	}
}
