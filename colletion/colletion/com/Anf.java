package colletion.com;

import java.util.ArrayList;
import java.util.Iterator;

public class Anf {

	public static void main(String[] args) {
		// ArrayList<String> list = new ArrayList<String>();
		// list.add("wjj");
		// list.add("lpp");
		// Iterator<String> i = list.iterator();
		//
		// while (i.hasNext()) {
		// System.out.println(i.next());
		// }
		//
		// Student s1 = new Student("wjj", 19);
		// Student s2 = new Student("lpp", 18);
		//
		// ArrayList<Student> list2 = new ArrayList<Student>();
		// list2.add(s1);
		// list2.add(s2);
		//
		// Iterator<Student> i2 = list2.iterator();
		//
		// while (i2.hasNext()) {
		// System.out.println(i2.next());
		// }

		inter<String> o = new Objecttool<String>();
		o.show("123");
		inter<Integer> o2 = new Objecttool<Integer>();
		o2.show(1321);
		inter<?> o3 = new Objecttool<String>();
 	}

}
