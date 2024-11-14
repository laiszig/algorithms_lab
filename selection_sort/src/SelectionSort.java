import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {

    private static List<Integer> selectionSort(List<Integer> arr) {
        List<Integer> newArr = new ArrayList<>(arr.size());     // Create a new list 'newArr' to store the sorted elements
        int size = arr.size();      // Get the size of the input list

        for(int i = 0; i < size; i++) {        // Repeat the process 'size' times to sort all elements
            int smallest = findSmallest(arr);    // Find the index of the smallest element in the remaining unsorted portion of 'arr'
            newArr.add(arr.get(smallest));
            arr.remove(smallest);
        }
        return newArr;
    }

    private static int findSmallest(List<Integer> arr) {
        int smallest = arr.get(0);      // Assume the first element is the smallest initially
        int smallestIndex = 0;

        for (int i = 0; i < arr.size(); i++) {       // Iterate over the list to find the actual smallest element
            // If the current element is smaller than the current smallest,
            // update 'smallest' and 'smallestIndex' to the current element and index
            if (arr.get(i) < smallest) {
                smallest = arr.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;       // Return the index of the smallest element found
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(5, 3, 6, 2, 10));
        System.out.println(selectionSort(arr)); //[2, 3, 5, 6, 10]
    }
}
