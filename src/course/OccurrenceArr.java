package course;

public class OccurrenceArr  {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3,2,6,7};
            occurrenceArr(nums);
    }

     static void occurrenceArr(int[] arr) {
// for (int i)
        int current = arr[0];
        for (int j : arr) {
            int count = 0;
            if (current == j) {
                count++;
            }
            System.out.println(j + " " + count);
        }
    }
}
