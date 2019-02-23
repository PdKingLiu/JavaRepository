package cn.IOdemo_3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

public class PropertiesAndStream {
	public static void main(String[] args) throws IOException {
		Properties pps = new Properties();
		// pps.setProperty("wjj", "18");
		// pps.setProperty("lpp", "19");
		// Set<String> set = pps.stringPropertyNames();
		// for (String string : set) {
		// String s = pps.getProperty(string);
		// System.out.println(string+"---"+s);
		// }
		Reader rr = new FileReader("user.txt");
		pps.load(rr);
		rr.close();
		//
		// Set<String> set = pps.stringPropertyNames();
		// for (String string : set) {
		// String s = pps.getProperty(string);
		// System.out.println(string+"---"+s);
		// }
		Writer ww = new FileWriter("bb.txt");
		pps.store(ww, "this is commit");
	}
}
