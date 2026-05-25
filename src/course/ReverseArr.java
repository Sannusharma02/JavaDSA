package course;

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,9,7};
        reverseArr(arr);
    }

//    private static int[] reverseArr(int[] arr) {
//        int[] newArr = new int[arr.length];
//        for (int i=0;i<arr.length;i++){
//            newArr[i]=arr[arr.length-1-i];
//        }
//        return newArr;
//    }

    private static void reverseArr(int[] arr) {
        int[] res = new int[arr.length];
        for (int i=0;i<arr.length/2;i++){
            res[i] = arr[arr.length-1-i];
            res[i+1] = arr[arr.length-1-i-1];
            res[arr.length-1-i]=arr[i];
        }
        System.out.println(Arrays.toString(res));
    }
}