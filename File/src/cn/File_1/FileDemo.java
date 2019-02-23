package cn.File_1;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		// File file = new File(
		// "D:\\a\\b\\c\\d\\a\\b\\c\\d\\a\\b\\c\\d\\a\\b\\c\\d\\a\\b\\c\\d\\a\\b\\c\\d\\a\\b\\c\\d\\a\\b\\c\\d");
		// File file2 = new File("D:", "a.txt");
		// File file3 = new File("D:");
		// File file4 = new File(file3, "a.txt");
		// System.out.println(file2.createNewFile());
		// System.out.println(file.mkdirs());

		// File f = new File("D:\\eclipse-workspace\\IO\\src\\cn\\File_1\\aaa");
		// System.out.println(f.delete());
		// File f = new File("a.txt");
		// System.out.println(f.createNewFile());
		// System.out.println(f.delete());

		// ÖØÃüÃû
		File f = new File("D:\\123.md");
		File f2 = new File("G:\\321.md");
		//System.out.println(f.createNewFile());
		
		System.out.println(f.renameTo(f2));

	}
}
