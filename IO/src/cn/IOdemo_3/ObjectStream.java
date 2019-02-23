package cn.IOdemo_3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Properties;

public class ObjectStream {
	public static void main(String[] args) throws Exception {

		//write();

		read();

	}

	private static void write() throws Exception {
		Student s = new Student("lpp", 19);
		Student s2 = new Student("wjj", 18);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("oop.txt"));
		objectOutputStream.writeObject(s);
		objectOutputStream.writeObject(s2);

	}

	private static void read() throws Exception {
		ObjectInputStream objectOutputStream = new ObjectInputStream(new FileInputStream("oop.txt"));
		Student ss = (Student) objectOutputStream.readObject();
		System.out.println(ss);
		ss = (Student) objectOutputStream.readObject();
		System.out.println(ss);

		objectOutputStream.close();

	}
}
