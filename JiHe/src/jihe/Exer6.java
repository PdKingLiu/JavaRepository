package jihe;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class Exer6 {

	public static void main(String[] args) {
		TreeMap<Student, String> trr = new TreeMap<Student, String>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				int num = o1.getAge() - o2.getAge();
				int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
				return num2;
			}

		});
		trr.put(new Student("wjj", 18), "b");
		trr.put(new Student("lpp", 19), "h");
		Set<Student> st = trr.keySet();
		for (Student s : st) {
			String s2 = trr.get(s);
			System.out.println(s.getName() + s.getAge() + s2);
		}
	}

}
