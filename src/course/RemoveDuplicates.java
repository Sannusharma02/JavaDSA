package course;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,4};
//        int[] arr = {1,1,1};
        removeDuplicates(arr);
    }

    private static void removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array doesn't exist");
            return;
        }
        int index = 1;
        for(int i =1; i < arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[index++]=arr[i];
            }
        }
        int[] result = Arrays.copyOf(arr,index);
        System.out.println("Array after removing duplicates "+ Arrays.toString(result));
    }
}
