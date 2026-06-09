package course;

import java.util.Arrays;

public class RotateKPos {

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        int target=7;
        int k=target % arr.length;

        rotate(arr,0,arr.length-1);
        rotate(arr,0,k-1);
        rotate(arr,k,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] nums, int start, int end) {
        while(start<end){
            int temp=nums[start];
            nums[start++]=nums[end];
            nums[end--]=temp;
        }
    }
}
