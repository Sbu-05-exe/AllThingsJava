import java.util.Arrays;

public class BubbleSort {

	public static int[] makeIntArray(String[] arr){


		int[] result = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			result[i] = Integer.parseInt(arr[i]);

		}

		return result;

	}

	public static void main(String[] args) {
			
		int[] data = makeIntArray(args);

		System.out.println(Arrays.toString(data));

		bubble(data);
		System.out.println(Arrays.toString(data));

	}

	public static void bubble(int[] list) {

		int temp;
		boolean swapping = true;

		while (swapping) {
			swapping = false;

			for (int i = 0; i < list.length-1; i++) {

				if (list[i] > list[i+1]) {

					temp = list[i];
					list[i] = list[i+1];
					list[i+1] = temp;
					swapping = true;
				
				}

			}
		
		}


	}

}