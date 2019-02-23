package colletion.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class First {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("1");
		c.add("2");
		c.add("3");
		c.add("4");
		Collection c2 = new ArrayList();
		c2.add("1");
		c2.add("2");
		c2.add("3");
		c2.add("4");
		c2.add("5");
		c2.add("6");
		c2.add("7");
		// System.out.println(c);
		// System.out.println(c.addAll(c2));
		// System.out.println(c);
		// System.out.println(c.removeAll(c2));
		// System.out.println(c);
		// System.out.println(c.containsAll(c2));
		// System.out.println(c.retainAll(c2));
		// System.out.println(c);
		Object[] obj = c2.toArray();
		for (int i = 0; i < obj.length; i++) {
			String s = (String) obj[i];
			System.out.print(s + "____" + s.length() + " ");
		}
		System.out.println();
		Iterator it = c2.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.print(s + "____" + s.length() + " ");
		}
	}

}
