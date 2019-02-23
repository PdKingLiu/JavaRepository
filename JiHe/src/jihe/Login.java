package jihe;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {

		String dname;
		String dpassword;
		
		Scanner sc = new Scanner(System.in);

		a: while (true) {
			System.out.println("1.µÇÂ¼");
			System.out.println("2.×¢²á");
			System.out.println("3.ÍË³ö");
			IsLogin l = new UserImpl();
			String choice = sc.nextLine();
			switch (choice) {
			case "1":
				System.out.println("ÕËºÅ£º");
				dname = sc.nextLine();
				System.out.println("ÃÜÂë£º");
				dpassword = sc.nextLine();
				boolean b = l.isLogin(dname, dpassword);
				if (b) {
					System.out.println("µÇÂ¼³É¹¦");
					break a;
				} else
					System.out.println("µÇÂ¼Ê§°Ü");
				break;
			case "2":
				User u = new User();
				System.out.println("ÕËºÅ£º");
				dname = sc.nextLine();
				System.out.println("ÃÜÂë£º");
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
