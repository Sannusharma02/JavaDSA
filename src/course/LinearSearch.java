package course;

import java.util.Scanner;

public class LinearSearch {

    public static  int linearSearch(int[] array, int target)
    {
        int index =-1;
        for(int i=0;i<array.length;i++){
            if(array[i]==target){
                index=i;
                break;
            }
        }
        return ++index;
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        System.out.println(        linearSearch(arr,20));
    }

}
