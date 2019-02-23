package cn.IOdemo_2;

import java.io.FileReader;
import java.io.LineNumberReader;

public class LineNumber {
	public static void main(String[] args) throws Exception{
		LineNumberReader lnr = new LineNumberReader(new FileReader("file.txt"));
		String s = null;
		lnr.setLineNumber(56);
		while((s=lnr.readLine())!=null) {
			System.out.println(lnr.getLineNumber()+":"+s);
		}
	}
}
