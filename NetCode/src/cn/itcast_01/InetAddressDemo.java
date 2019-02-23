package cn.itcast_01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress ia = InetAddress.getByName("192.168.1.192");
		String s = ia.getHostAddress();
		String s2 = ia.getHostName();
		System.out.println(s);
		System.out.println(s2);
	}
}
