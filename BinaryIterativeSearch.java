public class BinaryIterativeSearch implements Practice2Search {
    private static final String BINARY_ITERATIVE_SEARCH_NAME = "Binary Iterative Search";

    @Override
    public String searchName() {
        return BINARY_ITERATIVE_SEARCH_NAME;
    }

    @Override
    public int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        //8 / 2 = 4 ; 9 / 2 = 4
        int middle = 0;
        do {
            middle = (end - start) / 2 + start;
            if (arr[middle] == target) {
                return middle;
            } else if (target < arr[middle]) {
                //smaller than the middle
                end = middle - 1;
            } else {
                //bigger than the middle
                start = middle + 1;
            }
        } while (start < end || start == end);
        return -1;
    }
}
