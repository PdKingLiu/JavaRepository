package cn.IOdemo_1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OnputStreamDemo_2 {
	public static void main(String[] args) {

		FileOutputStream name = null;
		try {
			name = new FileOutputStream("file.txt", true);
			name.write("hello".getBytes());
			name.write(" world".getBytes());
			name.close();
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} finally {
			try {
				name.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
}
