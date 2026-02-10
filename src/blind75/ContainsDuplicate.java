package blind75;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> visited = new HashSet<>();
        for (int num : nums) {
            if (visited.contains(num)) {
                return true;
            } else {
                visited.add(num);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 1};
        ContainsDuplicate dc = new ContainsDuplicate();
        System.out.println(dc.containsDuplicate(nums));
    }
}
