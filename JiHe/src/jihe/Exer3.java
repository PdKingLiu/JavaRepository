package jihe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Exer3 {

	public static void main(String[] args) {
		String[] str = { "1", "2", "3" };
		List<String> list = Arrays.asList(str);
//		list.add("a");
		
		ArrayList<ArrayList<Student>> arr = new ArrayList<ArrayList<Student>>();
		ArrayList<Student> arre = new ArrayList<Student>(); 
		Student s = new Student("lpp",19);
		arre.add(s);
		arr.add(arre);
		for(ArrayList<Student> ar:arr) {
			for(Student st : ar) {
				System.out.println(st.getName()+st.getAge());
			}
		}
	}

}
