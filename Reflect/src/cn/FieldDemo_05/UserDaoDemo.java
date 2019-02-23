package cn.FieldDemo_05;

public class UserDaoDemo {
	public static void main(String[] args) {
		UserDao dao = new UserDaoImp();
		dao.add();
		dao.del();
		dao.update();
		dao.find();
		System.out.println("----");
		MyInvoca invoca = new MyInvoca(dao);
		
	}
}
