package blind75;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate2 {

//    public boolean containsDuplicate2(int[] nums){
//        return Arrays.stream(nums).distinct().count() < nums.length;
//    }

    public boolean containsDuplicate2(int[] nums){
        Set<Integer> set =new HashSet<>();
        if(nums==null || nums.length==0){
            return false;
        }
        for(int i:nums){
            if(set.contains(i)){
                return true;
            }
            else {
                set.add(i);
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums = {-1,2,4,5,6,7,8};
        ContainsDuplicate2 dc = new ContainsDuplicate2();
        System.out.println("contains duplicate : "+dc.containsDuplicate2(nums));
    }
}
