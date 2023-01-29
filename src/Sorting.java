import java.util.*;
public class Sorting {
//    Choose one of the following to implement: Insertion Sort Quick Sort Merge Sort | QuickSort
//    What sorting algorithms have the best runtime efficiency? | Merge Sort - O(n*log(n)), Heap Sort - O(n*log(n)), Quick Sort - O(n*log(n)) (average-case)
//    What are the scenarios for the best case, worst case, and average case runtime efficiency? | If the least-optimal pivot is chosen each time, Quicksort can be
//    O(n^2) in the worst case but this is rare. Quicksort is often the fastest sorting algorithm depending on the pivot used and size of the input.

    public static void sort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            sort(array, low, pivotIndex - 1);
            sort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        sort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
