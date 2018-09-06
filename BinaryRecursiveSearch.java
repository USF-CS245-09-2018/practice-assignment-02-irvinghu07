public class BinaryRecursiveSearch implements Practice2Search {
    private static final String BINARY_RECURSIVE_SEARCH_NAME = "Binary Recursive Search";

    private static int[] sharedArray;

    private static int sharedTarget;

    @Override
    public String searchName() {
        return BINARY_RECURSIVE_SEARCH_NAME;
    }

    @Override
    public int search(int[] arr, int target) {
        sharedArray = arr;
        sharedTarget = target;
        return search(0, arr.length);
    }

    public int search(int start, int end) {
        if (start < end) {
            int mid = (end - start) / 2 + start;
            int currentValue = sharedArray[mid];
            if (currentValue < sharedTarget) {
                return search(mid + 1, end);
            } else if (currentValue > sharedTarget) {
                return search(start, mid);
            } else {
                return mid;
            }
        }
        return -1;
    }
}
