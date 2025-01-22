package leetcode;

public class SearchInsertPosition_54 {

    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        int place = 0;

        while(low <= high) {
            int mid = (low + high) / 2;
            int guess = nums[mid];
            place = mid;
            if(guess == target) {
                return mid;
            }
            if(guess > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (target < low) {
            return place + 1;
        }
        return low;
    }

    public static void main(String[] args) {

        SearchInsertPosition_54 search = new SearchInsertPosition_54();
//        int result = search.searchInsert(new int[] {1,3,5,6}, 5);
//        System.out.println(result);
//        int result2 = search.searchInsert(new int[] {1,3,5,6}, 2);
//        System.out.println(result2);
//        int result3 = search.searchInsert(new int[] {1,3,5,6}, 7);
//        System.out.println(result3);
//        int result4 = search.searchInsert(new int[] {-1,3,5,6}, 0);
//        System.out.println(result4);
//        int result5 = search.searchInsert(new int[] {1,3,5,6}, 0);
//        System.out.println(result5);
        int result6 = search.searchInsert(new int[] {-3,-1,3,90}, 0);
        System.out.println(result6);
    }
}
