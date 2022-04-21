
public class Fibonacci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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