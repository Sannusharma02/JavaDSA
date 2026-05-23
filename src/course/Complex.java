package course;

import java.util.Arrays;

public class Complex {

    public static void main(String[] args) {
//        constantTime();
        linearTime();
    }

    static void constantTime() {
        int[] arr = { 1, 2, 3, 4, 5};
    }

    static void linearTime() {
        int[] arr = { 1, 2, 3, 4, 5};
        for(int i :arr  ){
            System.out.print( i+ " time ");
            System.out.println(arr[i-1]); //O(1)
        }
    }

}
