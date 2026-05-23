package algorithmsAndDataStructuresBeginners;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BogoSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(29, 100, 1, 2, 57));
        bogoSort(list);
        System.out.println(list);
    }

    static void bogoSort(ArrayList<Integer> list){
        int attempts = 0;
        while(!isSorted(list)) {
            System.out.println(attempts++);
            Collections.shuffle(list);
        }
    }

    static boolean isSorted(ArrayList<Integer> list){
        for (int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                return false;
            }
        }
        return true;
    }
}
