package nonstaticvari;

import java.util.*;

public class ArrayPratice {

	static Scanner sc = new Scanner(System.in);

	static int[] array = { 91, 223, 13, 36, 5, 6, 87, 48, 9 };

	void arrayAve() {
		int sum = 0;
		double average;
		for (int i = 0; i < array.length; ++i) {
			sum += array[i];
		}
		average = sum / array.length;
		System.out.println("The average of the array is: " + average);
	}

	void numCheck() {
		System.out.println("Enter number to check in the array: ");
		int find = sc.nextInt();
		int check = 0;
		for (int i = 0; i < array.length; ++i) {
			if (array[i] == find)
				check = i;
		}
		if (check == 0)
			System.out.println("Then number you entered is not in the array.");
		else {
			System.out.println("Then number you entered has been found at position: " + (check + 1));
			System.out.println("Then number you entered has been found at index: " + check);
		}
	}

	void removeVal() {
		System.out.println("These are the values in the array:");
		for (int i = 0; i < array.length; ++i) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
		System.out.println("Enter number to remove from the array: ");
		int remove = sc.nextInt();
		for (int i = 0; i < array.length; ++i) {
			if (array[i] == remove) {
				for (int j = i; j < (array.length - 1); j++) {
					array[j] = array[j + 1];
				}
				array[array.length - 1] = 0;
			}
		}
		System.out.println("The new values in the array:");
		for (int i = 0; i < array.length - 1; ++i) {
			System.out.print(array[i] + " ");
		}

	}

	public static void main(String[] args) {
		
		ArrayPratice pratice = new ArrayPratice();
		pratice.arrayAve();
		System.out.println("");

		pratice.numCheck();
		System.out.println("");
		
		pratice.removeVal();

	}
}
