package algorithmsAndDataStructuresBeginners;

public class IterativeBinarySearch {
    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6,7,8,9,10};
        int key = 7;
        System.out.print(binarySearch(data,key));
    }

    public static Integer binarySearch (int[] input, int target) {
        int first = 0;
        int last = input.length - 1;

        while (first <= last) {
            int mid = (first + last) / 2;

            if( input[mid] == target) {
                return mid;
            } else if(input[mid] < target) {
                first = mid + 1;
            } else
                last = mid - 1;
        }
        return -1;
    }
}
