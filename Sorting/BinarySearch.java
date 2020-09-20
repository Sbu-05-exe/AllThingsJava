//Sibusiso Dlamin
import java.util.Random;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {0,1,2,3,4,5,6,7,8,9};

		int index = search(arr, 10);

		System.out.println(index);
		
	}

	public static int search(int[] list, int target) {

		int high, mid, low;

		high = list.length - 1;
		low = 0;

		while (high >= low) {

			mid =  (int) ((low + high) / 2);

			System.out.printf("high: %d, mid: %d, low: %d\n",high, mid, low);

			if (list[mid] > target)  {

				high = mid - 1;

			} else if (list[mid] < target) {

				low = mid + 1;

			} else {

				return mid;
			
			}
		
		}

		return -1;

	}
}