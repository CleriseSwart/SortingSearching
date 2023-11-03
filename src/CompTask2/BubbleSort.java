package CompTask2;

import java.util.ArrayList;

public class BubbleSort {
    public static void main(String[] args) {
        // Create and initialize the ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("blue");
        list.add("six");
        list.add("hello");
        list.add("game");
        list.add("unorthodox");
        list.add("referee");
        list.add("ask");
        list.add("zebra");
        list.add("run");
        list.add("flex");

        // Call the bubbleSort method to sort the list
        bubbleSort(list);

        // Print the sorted list
        System.out.println("Sorted List: " + list);
    }

    public static void bubbleSort(ArrayList<String> list) {
        int n = list.size(); // Get the number of elements in the list
        boolean swapped;

        // Iterate over the list
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // Compare adjacent elements and swap if necessary
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    // Swap the elements
                    String temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    swapped = true;
                }
            }

            // If no two elements were swapped in the inner loop, the list is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}

