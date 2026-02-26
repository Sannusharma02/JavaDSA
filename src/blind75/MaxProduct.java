package blind75;

public class MaxProduct {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int min = nums[0];
        int max = nums[0];
        int result = max;
        for (int i = 1; i < nums.length; i++) {
            int cur = nums[i];
            int temp =Math.max(cur,Math.max(max*cur, min*cur));
            min = Math.min(cur,Math.min(max*cur, min*cur));
            max = temp;
            result = Math.max(result, max);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(new MaxProduct().maxProduct(nums));
    }
}
