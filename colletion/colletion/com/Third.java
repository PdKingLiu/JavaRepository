package colletion.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Third {

	public static void main(String[] args) {
		// List l = new ArrayList();
		// l.add("1");
		// l.add("2");
		// l.add("3");
		//
		// Iterator it = l.iterator();
		// while (it.hasNext()) {
		// String s = (String) it.next();
		// System.out.print(s + " ");
		// }
		// System.out.println();
		// l.add(1, 1.5);
		// l.add(4, 4);
		// System.out.println(l);
		// System.out.println(l.get(3));
		// Double f = (Double)l.get(1);
		// l.remove(1);
		// System.out.println(l.set(1, "1"));
		// System.out.println(l);
		List list = new ArrayList();

		// Student s1 = new Student();
		// Student s2 = new Student();
		// Student s3 = new Student();
		// Student s4 = new Student();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		for (int i = 0; i < list.size() - 1; i++) {
			System.out.println(list.get(i));
		}
		ListIterator listIterator = list.listIterator();
		while (listIterator.hasPrevious()) {
			String object = (String) listIterator.next();
			System.out.println(object);
		}
	}

}
