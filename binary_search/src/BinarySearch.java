public class BinarySearch {

    private static Integer binarySearch(int[] list, int item) {
        int low = 0;                        // low and high keep track of which
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