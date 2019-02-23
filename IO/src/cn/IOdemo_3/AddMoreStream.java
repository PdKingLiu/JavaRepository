package cn.IOdemo_3;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class AddMoreStream {
	public static void main(String[] args) throws Exception {
		Vector<InputStream> inputStreams = new Vector<InputStream>();
		InputStream i1 = new FileInputStream("raf.txt");
		InputStream i2 = new FileInputStream("data.txt");
		InputStream i3 = new FileInputStream("user.txt");
		inputStreams.add(i1);
		inputStreams.add(i2);
		inputStreams.add(i3);
		Enumeration<InputStream> e = inputStreams.elements();
		SequenceInputStream inputStream = new SequenceInputStream(e);
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("add3.txt"));
		byte[] b = new byte[1024];
		int len;
		while((len=inputStream.read(b))!=-1) {
			bufferedOutputStream.write(b, 0, len);
		}
		bufferedOutputStream.close();
	}
}
