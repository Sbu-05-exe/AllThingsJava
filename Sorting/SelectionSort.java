import java.util.Arrays;

public class SelectionSort {

	public static int[] mapToInt(String[] arr) {

		int[] result = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			result[i] = Integer.parseInt(arr[i]);

		}

		return result;

	}

	public static void selection (int[] list) {

		int min_index, temp, i, j;

		for (i = 0; i < list.length; i++) {

			min_index = i;

			for (j = i + 1; j < list.length; j++) {

				if (list[j] < list[min_index]) {
					
					// finding the index of the next smallest number after i
					min_index = j;

				}

			}

			// place the smallest number in i and place i where the smallest numer was 
			temp = list[min_index];
			list[min_index] = list[i];
			list[i] = temp;

		}
	}

	public static void main(String[] args) {

		int[] data = mapToInt(args);
		System.out.println(Arrays.toString(data));

		selection(data);

		System.out.println(Arrays.toString(data));

	}

}