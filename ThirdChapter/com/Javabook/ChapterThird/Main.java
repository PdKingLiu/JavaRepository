import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;

		n = sc.nextInt();
		String[] str = new String[200];
		String[] str2 = new String[200];
		for (int i = 0; i < n; i++) {
			str[i] = sc.next();
			str2[i] = sc.next();
		}
		for (int i = 0; i < n; i++) {
			BigInteger bigInteger = new BigInteger(str[i]);
			BigInteger bigInteger2 = new BigInteger(str2[i]);
			System.out.println(bigInteger.add(bigInteger2));
		}
		for (int i = 0; i < n; i++) {
			BigInteger bigInteger = new BigInteger(str[i]);
			BigInteger bigInteger2 = new BigInteger(str2[i]);
			System.out.println(bigInteger.subtract(bigInteger2));
		}

	}

}
