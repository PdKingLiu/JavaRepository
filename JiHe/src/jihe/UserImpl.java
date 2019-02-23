package jihe;

import java.util.ArrayList;

public class UserImpl implements IsLogin {
	private static ArrayList<User> arr = new ArrayList<User>();

	@Override
	public boolean isLogin(String name, String password) {
		boolean f = false;
		for (User u : arr) {
			if (u.getName().equals(name) && u.getPassword().equals(password)) {
				f = true;
			}
		}
		return f;
	}

	@Override
	public void regist(User user) {
		arr.add(user);
	}

}
