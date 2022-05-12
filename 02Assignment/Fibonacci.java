
public class Fibonacci {
	public static void main(String[] args) {
		int add, fnum = 0;
		int snum = 1;
		for (int num = 1; num < 50; num++) {
			add = snum + fnum;
			snum = fnum;
			fnum = add;
			System.out.println(add);
		}
	}
}