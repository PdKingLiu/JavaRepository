package cn.itcast_11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Send {
/*	public static void main(String[] args) throws IOException{
		Socket s = new Socket("192.168.1.192", 12355);
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(s.getOutputStream());
		BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("27.avi"));
		byte[] b = new byte[1024];
		int len;
		while((len=bufferedInputStream.read(b))!=-1) {
			bufferedOutputStream.write(b,0,len);
			bufferedOutputStream.flush();
		}
		s.shutdownOutput();
		InputStream inputStream = s.getInputStream();
		int l;
		byte[] b2=new byte[1024];
		l=inputStream.read(b2);
		String ss = new String(b2,0,l);
		System.out.println(ss);
		bufferedInputStream.close();
		bufferedOutputStream.close();
	}*/
	
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("222.24.34.118", 12583);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter os = new BufferedWriter(new OutputStreamWriter(s.getOutputStream(), "UTF-8"));
		BufferedReader is = new BufferedReader(new InputStreamReader(s.getInputStream(), "UTF-8"));
		String str = null;
		while ((str = br.readLine()) != null) {
			if (str.equals("88")) {
				break;
			}

			os.write(str);
			os.newLine();
			os.flush();

//			String S;
//			System.out.println(is);
//			while ((S = is.readLine()) != null) {
//				System.out.println(S + "    " + is);
//			}
			// S = is.readLine();
			// System.out.println(S + " " + is);

		}
	}
}
