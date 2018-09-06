public class LinearSearch implements Practice2Search {

    private static final String LINEAR_SEARCH_NAME = "Linear Search";

    @Override
    public String searchName() {
        return LINEAR_SEARCH_NAME;
    }

    @Override
    public int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
