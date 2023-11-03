package CompTask3;

import java.util.Arrays;

public class SortSearch {
    public static void main(String[] args) {
        int[] arr = {27, -3, 4, 5, 35, 2, 1, -40, 7, 18, 9, -1, 16, 100};

        // Sort the array using Insertion Sort
        insertionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Search for the number 9 using Binary Search
        int target = 9;
        int index = binarySearch(arr, target);
        if (index != -1) {
            System.out.println(target + " found at index " + index);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }

    // Binary Search algorithm
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;  // Found the target element
            }

            if (arr[mid] < target) {
                left = mid + 1;  // Target is in the right half of the current range
            } else {
                right = mid - 1;  // Target is in the left half of the current range
            }
        }

        return -1;  // Target element not found
    }

    // Insertion Sort algorithm
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements greater than the key to one position ahead
            // of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;  // Insert the key in its correct position
        }
    }
}


/*
 *     // Implement the searching algorithm you haven’t tried yet in this Task on the
			sorted array to find the number 9: Linear Search algorithm
			public static int linearSearch(int[] arr, int target) {
    			for (int i = 0; i < arr.length; i++) {
        			if (arr[i] == target) {
            			return i;  // Found the target element
        				}
    				}
    			return -1;  // Target element not found
			}
	* linearSearch() performs a linear search on the code it iterates through the array
	* sequentially from start to finish to test every element to see if it matches the target value 
 */
/*
 * 1. Which searching algorithm would be appropriate to use on the given list?
 * Binary Search
 * 2. Why was this algorithm a good choice?
 * Binary Search required the list to be sorted, the given list was already sorted
 * in ascending order. Binary Search has a time complexity of O(log n) which makes it 
 * efficient for large data sets.
 * 3. Where would you use this algorithm in the real world?
 * Searching for a specific word in a dictionary.
 * Searching for an item in a sorted database table.
 * Auto-complete function for text editors.
 * Searching for a specific date or time in a schedule.
 **/
