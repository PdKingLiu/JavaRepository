package colletion.com;

public class animal {
	public static void main(String[] args) {
		Objecttool<? extends animal> c = new Objecttool<cat>();
		Objecttool<? super Dog> d = new Objecttool<animal>();
	}
}

class Dog extends animal {
}

class cat extends animal {
}

class ldog extends Dog{
	
}