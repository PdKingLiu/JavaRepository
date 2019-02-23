package cn.itcast_06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class ClientDemo {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("222.24.34.118", 12583);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter os = new BufferedWriter(new OutputStreamWriter(s.getOutputStream(), "UTF-8"));
		BufferedReader is = new BufferedReader(new InputStreamReader(s.getInputStream(), "UTF-8"));
		String str = null;
		// while ((str = br.readLine()) != null) {
		// if (str.equals("88")) {
		// break;
		// }
		//
		// os.write(str);
		// os.newLine();
		// os.flush();
		//
		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					String str = null;
//					while (true) {
						while ((str = br.readLine()) != null) {
							os.write(str);
							os.newLine();
							os.flush();
						}
//					}
				} catch (Exception e) {
				}
			}
		}).start();
		String S;
		while ((S = is.readLine()) != null) {
			System.out.println(S + "    " + is);
			// str = br.readLine();
			// os.write(str);
			// os.newLine();
			// os.flush();
		}

		// S=is.readLine();
		// System.out.println(S);

		// }
	}
}