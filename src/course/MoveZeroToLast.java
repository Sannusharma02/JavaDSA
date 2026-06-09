package course;

import java.util.Arrays;

public class MoveZeroToLast {
    public static void main(String[] args) {
        int [] arr = { 0,3,5,0,9};
        moveZeroToLast(arr);
    }

    private static void moveZeroToLast(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[index++]=arr[i];
            }
        }
        while (index<arr.length){
            arr[index++]=0;
        }
        System.out.println(Arrays.toString(arr));
    }

}
