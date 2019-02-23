package jihe;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class Exer8 {

	public static void main(String[] args) {
		HashMap<String, HashMap<String, Integer>> on = new HashMap<String, HashMap<String, Integer>>();
		HashMap<String, Integer> in = new HashMap<String, Integer>();
		HashMap<String, Integer> in2 = new HashMap<String, Integer>();
		in.put("wjj", 18);
		in.put("lpp", 19);
		in2.put("wjj2", 18);
		in2.put("lpp2", 19);
		on.put("one", in);
		on.put("two", in2);
		// on.put(null, null);
		Set<String> set = on.keySet();
		int q = 1;
		for (String s : set) {
			HashMap<String, Integer> hp = on.get(s);
			Set<String> ss = hp.keySet();
			System.out.println(q++);
			for (String sss : ss) {
				Integer iii = hp.get(sss);
				System.out.println('\t' + sss + iii);
			}
		}
		// Hashtable<String, String> hhh= new Hashtable<String,String>();
		// hhh.put(null, null);

	}

}
