package jihe;

import java.util.HashSet;

public class Exer5 {
	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		h.add("1");
		h.add("2");
		h.add("1");
		for (String s : h) {
			System.out.println(s);
		}
		HashSet<Student> h2 = new HashSet<Student>();
		Student s2 = new Student("lpp", 19);
		Student s3 = new Student("wjj", 18);
		Student s4 = new Student("lpp", 19);
		h2.add(s2);
		h2.add(s4);
		h2.add(s3);
		for (Student ss : h2) {
			System.out.println(ss.getName()+ss.getAge());
		}
	}
}
