package jihe;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapexer {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("lpp", "19");
		map.put("wjj", "18");
		System.out.println(map);
		// System.out.println(map.remove("lpp"));
		// System.out.println(map);
		// System.out.println(map.containsKey("lpp"));
		// System.out.println(map.containsValue("19"));
		System.out.println(map.get("lpp"));
		Set<String> set = map.keySet();
		Collection<String> con = map.values();
		for (String s : set) {
			System.out.println(map.get(s));
		}
		Set<Map.Entry<String, String>> s = map.entrySet();
		for (Map.Entry<String, String> m : s) {
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
	}

}