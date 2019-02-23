package cn.IOdemo_3;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DateStream {
	public static void main(String[] args) throws Exception{
		DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("data.txt"));
		dataOutputStream.writeInt(123);
		dataOutputStream.writeUTF("º£Å¸");
	}
}
