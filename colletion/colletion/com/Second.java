package colletion.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Second {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("qwe");
		c.add("rty");
		c.add("uio");
		Iterator it = c.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.print(s + " ");
		}
		c.clear();
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();

		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		it = c.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s);
		}
	}

}
