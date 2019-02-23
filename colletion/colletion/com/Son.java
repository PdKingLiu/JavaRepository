package colletion.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Son {
	public static void main(String[] args) {
		// // Vector v = new Vector();
		// // v.addElement("111");
		// // v.addElement("222");
		// // v.addElement("333");
		// // for (int i = 0; i < v.size(); i++) {
		// // System.out.print((String) v.elementAt(i)+"¡ª¡ª");
		// // }
		// // System.out.println();
		// // Enumeration et = v.elements();
		// // while (et.hasMoreElements()) {
		// // String s = (String) et.nextElement();
		// // System.out.print(s+"¡ª¡ª");
		// // }
		// LinkedList list = new LinkedList();
		// list.add("931");
		// list.add("942");
		// list.add("931");
		// list.addFirst("QQ:");
		// list.add("280");
		// list.add("931");
		// list.add("280");
		// list.add("931");
		// list.add("280");
		// list.removeFirst();
		// System.out.println(list);
		// LinkedList list2 = new LinkedList();
		// Iterator it = list.iterator();
		// while(it.hasNext()) {
		// String s = (String)it.next();
		// if(!list2.contains(s)) {
		// list2.add(s);
		// }
		// }
		// System.out.println(list2);
		// for(int i=0;i<list.size()-1;i++) {
		// for(int j=i+1;j<list.size();j++) {
		// if(list.get(i).equals(list.get(j))) {
		// list.remove(j);
		// j--;
		// }
		// }
		// }
		// System.out.println(list);
		ArrayList list = new ArrayList();
		Student s1 = new Student("ÍõË´", 3);
		Student s2 = new Student("ÍõË´µÜµÜ", 2);
		Student s3 = new Student("ÁõÅæ¶°", 18);
		Student s4 = new Student("ÍõÒ»³¬", 2);
		Student s5 = new Student("ÍõÒ»³¬", 3);
		Student s6 = new Student("ÁõÅæ¶°", 18);
		Student s7 = new Student("ÍõË´", 3);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.add(s7);

		ArrayList list2 = new ArrayList();
		Iterator i = list.iterator();
		while (i.hasNext()) {
			Student s = (Student) i.next();
			if (!list2.contains(s)) {
				list2.add(s);
			}
		}
		System.out.println(list);
		System.out.println(list2);
	}

}
