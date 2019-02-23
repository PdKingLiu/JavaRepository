package jihe;

public class Exer1 {
	public static int digui(int i, int j) {
		if (j == 0 || j == i)
			return 1;
		else
			return digui(i - 1, j) + digui(i - 1, j - 1);
	}

	public static void main(String args[]) {
		int tri[][];
		tri = new int[10][10];
		for (int i = 0; i < 10; i++)
			for (int j = 0; j <= i; j++)
				tri[i][j] = digui(i, j);
		for (int i = 0; i < 10; i++) {
			System.out.println();
			for (int n = 10 - i; n >= 1; n--)
				System.out.print(" ");
			for (int j = 0; j <= i; j++)
				System.out.print(tri[i][j] + " ");
		}
	}
}
