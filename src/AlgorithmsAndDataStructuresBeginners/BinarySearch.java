package AlgorithmsAndDataStructuresBeginners;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    static int indexOfItem(List<String> list, String target){
        int first = 0;
        int last = list.size()-1;
        while(first <= last){
            int midPoint = (first+last)/2;
            int comparisonResult = list.get(midPoint).compareTo(target );
            if (comparisonResult == 0) {
                return midPoint;
            } else if (comparisonResult < 0) {
                first = midPoint + 1;
            } else {
                last = midPoint - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Note that the list is sorted this time!
        ArrayList<String> list = new ArrayList<String>(
                Arrays.asList("Elida Sleight", "Francina Vigneault", "Lucie Hansman", "Nancie Rubalcaba"));
        System.out.println(indexOfItem(list, "Lucie Hansman"));
    }
}
