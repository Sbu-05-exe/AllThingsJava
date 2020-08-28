import java.util.Arrays;

public class SelectionSort {

	public static int[] mapToInt(String[] arr) {

		int[] result = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			result[i] = Integer.parseInt(arr[i]);

		}

		return result;

	}

	public static void main(String[] args) {

		int[] data = mapToInt(args);
		System.out.println(Arrays.toString(data));
		System.out.println(Arrays.toString(data));

	}



}