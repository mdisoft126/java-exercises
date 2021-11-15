package arrays;

public class EX_12_6 {
	public static void main(String args[]) {
		int tab[][] = new int[10][];
		int a = 0, b = 0;
		int fib = 1;
		int len = 10;
		int k = 0;
		for (int i = 0; i < len; i++) {
			b = fib;
			fib += a;
			a = b;
			int c = b;
			if (fib % 2 == 0) {
				len++;
			}
			if (b % 2 != 0) {
				tab[k] = new int[b];
				System.out.print("i[" + k + "] = ");
				for (int j = 0; j < b; j++) {
					tab[k][j] = c;
					System.out.print(c + " ");
					c--;
				}
				System.out.println(" ");
				k++;
			}
		}
	}
}
