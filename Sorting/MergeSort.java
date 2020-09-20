import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		int[] data = mapArrToInt(args);
		System.out.println(Arrays.toString(data));
		// System.out.println((0 + 1)/2);
		mergeSort(data, 0 , data.length - 1);

		System.out.println(Arrays.toString(data));
	}

	public static int[] mapArrToInt(String[] list) {

		int[] result = new int[list.length];

		for (int i = 0; i < list.length; i++ ) {

			result[i] = Integer.valueOf(list[i]);
		
		}

		return result;

	}

	public static void mergeSort(int[] list, int start,int end) {

		if (end - start > 0) {
			
			int mid = ((start + end)/2);

			//split up the array recursively so that we deal with the smallest parts first 
			mergeSort(list, start, mid);
			mergeSort(list, mid + 1, end);
			// then finally solve that small part which will make solving the larger parts quicker
			merge(list, start, mid, end);
			
		}

	}

	public static void merge(int[] list, int start, int mid, int end) {

		// System.out.println(start + " " + mid + " " + end);


		// Take the left size of the hand start to mid and insert it into an array
		//  and do the same for the left
		int leftSize = mid - start + 1;
		int rightSize = end - mid;
		int[] leftHand = new int[leftSize + 1];
		int[] rightHand = new int[rightSize + 1];

		for (int i = 0; i < leftSize; i++) {

			// System.out.println("left " + i);
			leftHand[i] = list[i + start];

		}

		for (int i = 0; i < rightSize; i++) {
			
			// System.out.println("right " + i);
			rightHand[i] = list[i + mid + 1];
		
		}

		// System.out.print(Arrays.toString(leftHand) + " --- ");
		// System.out.println(Arrays.toString(rightHand));

		// sentinal value is fancy way of saying infinity. i could not use the double.Infinity because
		// I'm sorting integers
		int sentinal = Integer.MAX_VALUE;

		// add sentinal values for the final values of each array
		leftHand[leftSize] = sentinal;
		rightHand[rightSize] = sentinal;

		int l = 0, r = 0;
		int count = 0;

		int leftHandItem, rightHandItem;

		while ((l < leftSize) || (r < rightSize)) {
			// pick a hand to insert into the original array

			leftHandItem = leftHand[l];
			rightHandItem = rightHand[r];

			if (leftHand[l] > rightHand[r]) {

				list[start + count] = rightHandItem;
				r++;

			} else {

				list[start + count] = leftHandItem;
				l++;
			
			}

			count ++;

		}

	}

}