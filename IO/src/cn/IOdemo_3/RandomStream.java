package cn.IOdemo_3;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomStream {
	public static void main(String[] args) throws IOException {
		RandomAccessFile accessFile = new RandomAccessFile("raf.txt", "rw");
		accessFile.writeInt(123);
		accessFile.writeBoolean(false);
		accessFile.seek(1);
		int a = accessFile.readInt();
		System.out.println(a + accessFile.getFilePointer());
		boolean b = accessFile.readBoolean();
		System.out.println(b);
		System.out.println(accessFile.getFilePointer());
	}
}
