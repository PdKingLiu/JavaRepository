package cn.IOdemo_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UserDaoImpl implements UserDao {

	private static File F = new File("user.txt");
	static {
		try {
			F.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean isLogin(String username, String password) {
		boolean f = false;
		BufferedReader bffr = null;
		try {
			bffr = new BufferedReader(new FileReader("user.txt"));
			String str = null;
			while ((str = bffr.readLine()) != null) {
				String[] s = str.split("=");
				if (username.equals(s[0]) && password.equals(s[1])) {
					f = true;
					break;
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("ÎÄ¼þ²»´æÔÚ");
		} catch (IOException e) {
			System.out.println("µÇÂ¼Ê§°Ü");
		} finally {
			try {
				bffr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return f;
	}

	@Override
	public void regist(User user) {
		BufferedWriter bffw = null;
		try {
			bffw = new BufferedWriter(new FileWriter("user.txt", true));
			bffw.write(user.getName() + "=" + user.getPassword());
			bffw.newLine();
			bffw.flush();
		} catch (IOException e) {
			System.out.println("×¢²áÊ§°Ü");
		} finally {
			try {
				bffw.close();
			} catch (IOException e) {
				System.out.println("ÊÍ·ÅÄÚ´æÊ§°Ü");
			}
		}

	}

}
