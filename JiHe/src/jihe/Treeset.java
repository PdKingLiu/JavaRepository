package jihe;

import java.util.Comparator;
import java.util.TreeSet;

public class Treeset {
	public static void main(String[] args) {
		TreeSet<Integer> tre = new TreeSet<Integer>();
		tre.add(53);
		tre.add(12);
		tre.add(5);
		tre.add(44);
		tre.add(2);
		tre.add(44);
		tre.add(12);
		for (Integer i : tre) {
			// System.out.println(i);
		}
		TreeSet<Student> tre2 = new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				int num = o1.getAge() - o2.getAge();
				int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
				return num2;
			}

		});
		Student s1 = new Student("wjj", 18);
		Student s2 = new Student("lpp", 19);
		Student s3 = new Student("wjj", 18);
		tre2.add(s1);
		tre2.add(s2);
		tre2.add(s3);

		for (Student s : tre2) {
			System.out.println(s.getName() + s.getAge());
		}
	}
}
