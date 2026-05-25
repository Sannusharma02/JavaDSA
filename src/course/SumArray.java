package course;

import java.util.Scanner;

public class SumArray {

    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5};
        System.out.println(sumArray(nums));
    }

    public static int sumArray(int[] arr){
        int res = 0;
        for (int j : arr) {
            res += j;
        }
        return res;
    }

}
