import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

    private static Integer binarySearch(int[] list, int item) {
        int low = 0;                        // low and high - keep track of which
        int high = list.length - 1;         // part of the list you'll search in

        while (low <= high) {               // while you haven't narrowed it down to one element...
            int mid = (low + high) / 2;     // check the middle element
            int guess = list[mid];

            if (guess == item) {            // found the item
                return mid;
            }
            if (guess > item) {             // the guess was too high
                high = mid - 1;
            } else {                        // the guess was too low
                low = mid + 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] myList = {1, 3, 5, 7, 9};

        System.out.println(binarySearch(myList, 3)); // 1
        System.out.println(binarySearch(myList, -1)); // null
    }


}
/*
    There are two methods in Java that use BinarySearch.
    java.util.Arrays.binarySearch
    This method works on sorted arrays of different types (like int[], double[], Object[], etc.).
*/
class BinarySearchExample {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 11};
        int index = Arrays.binarySearch(numbers, 7);

        if (index >= 0) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}

/*
    java.util.Collections.binarySearch
    This method is used for sorted lists.
*/
class BinarySearchListExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        Collections.sort(numbers);  // Ensure the list is sorted

        int index = Collections.binarySearch(numbers, 7);

        if (index >= 0) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}

/*
    Both methods assume the array or list is sorted in ascending order.
    If the array or list is not sorted, the results may be incorrect.
    If the element is found, these methods return the index; if not, they return -(insertion point) - 1,
    where the insertion point is where the element would be inserted to maintain order.
*/

