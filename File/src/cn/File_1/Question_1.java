package cn.File_1;

import java.io.File;
import java.io.FilenameFilter;

public class Question_1 {
	public static void main(String[] args) {
		File f = new File("E:");
		File[] ff = f.listFiles();
		for (File file : ff) {
			if (file.isFile()) {
				if (file.getName().endsWith(".exe")) {
					System.out.println(file.getName());
				}
			}
		}
		System.out.println("！！！！！！！！2！！！！！！");
		ff = f.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				return new File(dir, name).isFile() && name.endsWith(".exe");
			}
		});
		for (File file : ff) {
			if (file.isFile()) {
				if (file.getName().endsWith(".exe")) {
					System.out.println(file.getName());
				}
			}
		}
	}
}
