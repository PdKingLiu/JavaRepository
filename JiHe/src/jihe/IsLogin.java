package jihe;

public interface IsLogin {
	public abstract boolean isLogin(String name, String password);

	public abstract void regist(User user);
}
