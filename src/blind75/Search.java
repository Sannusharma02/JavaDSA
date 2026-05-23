package blind75;

public class Search {
    public int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left +right) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[left] <= arr[mid]) {
                if(target<arr[left] || target>arr[mid]){
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            else {
                if(target>arr[right] || target<arr[mid]){
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
    static void main() {
        int[] arr = {6, 7, 2, 3, 4, 5};
        Search search = new Search();
        System.out.println(search.search(arr, 5));
    }
}
