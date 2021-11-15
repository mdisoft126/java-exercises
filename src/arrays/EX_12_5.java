package arrays;

public class EX_12_5 {
	public static void main(String args[]) {
		int tab[][] = new int[10][];
		int a=0, b=0;
		int fib=1;
		int d = tab.length;
		for(int i=0; i<d; i++) {
			System.out.print("i[" + i + "] = " + fib + " values ");
			b = fib;
			fib += a;
			a = b;
			int c = b;
			tab[i] = new int[b];
			for(int j=0; j<b; j++) {
				tab[i][j] = c;
				System.out.print(c + " ");
				c--;
			}
			System.out.println(" ");
		}
	}
}
