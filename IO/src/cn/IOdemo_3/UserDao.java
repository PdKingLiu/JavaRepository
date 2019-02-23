package cn.IOdemo_3;

public interface UserDao {
	
	public abstract boolean isLogin(String username, String password);

	public abstract void regist(User user);
}
