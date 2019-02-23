import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		((C)a).name();
	}
}

class A{
	
}
class B extends A{
	A a;
	public B(A a) {
		this.a=a;
	}
}
class C extends A{
	A a;
}
