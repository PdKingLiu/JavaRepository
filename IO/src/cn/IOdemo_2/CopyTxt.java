package cn.IOdemo_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CopyTxt {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("file2.txt"));
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("file3.txt"));

		// int ch;
		// while((ch=isr.read())!=-1) {
		// osw.write(ch);
		// }
		// isr.close();
		// osw.close();

		char[] ch = new char[1024];
		int l = 0;
		while ((l = isr.read(ch)) != -1) {
			osw.write(ch, 0, l);
			osw.flush();
		}
		isr.close();
		osw.close();
	}

}
