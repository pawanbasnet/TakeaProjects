package nonstaticvari;

public class ArrayCompare {
	void minMax() {
		int[] array = { 91, 223, 13, 36, 5, 6, 87, 48, 1, 500 };

		int min = array[0];
		int max = 0;
		for (int i = 0; i < array.length; ++i) {
			if (max < array[i])
				max = array[i];
			if (min > array[i])
				min = array[i];
		}
		System.out.println("The maximum value in the array is: " + max);
		System.out.println("The minimum value in the array is: " + min);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayCompare findMinMax = new ArrayCompare();
		findMinMax.minMax();
	}
}
