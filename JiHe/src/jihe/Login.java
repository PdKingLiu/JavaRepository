package jihe;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {

		String dname;
		String dpassword;
		
		Scanner sc = new Scanner(System.in);

		a: while (true) {
			System.out.println("1.��¼");
			System.out.println("2.ע��");
			System.out.println("3.�˳�");
			IsLogin l = new UserImpl();
			String choice = sc.nextLine();
			switch (choice) {
			case "1":
				System.out.println("�˺ţ�");
				dname = sc.nextLine();
				System.out.println("���룺");
				dpassword = sc.nextLine();
				boolean b = l.isLogin(dname, dpassword);
				if (b) {
					System.out.println("��¼�ɹ�");
					break a;
				} else
					System.out.println("��¼ʧ��");
				break;
			case "2":
				User u = new User();
				System.out.println("�˺ţ�");
				dname = sc.nextLine();
				System.out.println("���룺");
				dpassword = sc.nextLine();
				u.setName(dname);
				u.setPassword(dpassword);
				l.regist(u);
				break;
			case "3":
				break;
			default:
				break;
			}
		}
	}
}
