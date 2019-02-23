package cn.Mocies_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class synchronizedXXX {

	public static void main(String[] args) {
		// 安全的List集合
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
	}

}
