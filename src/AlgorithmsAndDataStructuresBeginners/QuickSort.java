package AlgorithmsAndDataStructuresBeginners;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {
    static ArrayList<Integer> quickSort(ArrayList<Integer> list){
        if(list.isEmpty() || list.size() == 1){
            return list;
        }
        ArrayList<Integer> lessThanPivot = new ArrayList<Integer>();
        ArrayList<Integer> greaterThanPivot = new ArrayList<Integer>();
        int pivot = list.get(0);
        int length = list.size();
        for(int i = 1; i < length; i++){
            int currentValue = list.get(i);
            if(currentValue <= pivot){
                lessThanPivot.add(currentValue);
            } else {
                greaterThanPivot.add(currentValue);
            }
        }
        ArrayList<Integer> sortedList = new ArrayList<Integer>(quickSort(lessThanPivot));
        sortedList.add(pivot);
        sortedList.addAll(quickSort(greaterThanPivot));
        return sortedList;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(32, 100, 1, 2, 29, 28, 88, 3, 50, 67, 37, 1, 57, 20));
        System.out.println(quickSort(list));
    }
}
