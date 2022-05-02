
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("The prime number between 1-100 are: ");
		int i, count;
		for (int prime = 2; prime <= 100; prime++) {
			count = 0;
			for (i = 1; i <= prime; i++) {
				if (prime % i == 0) {
					count++;
				}
			}
			if (count == 2)
				System.out.print(prime + "  ");
		}
	}
}
