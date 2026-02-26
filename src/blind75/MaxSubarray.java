package blind75;

public class MaxSubarray {
    public static int maxSubArray(int[] nums) {
        int curSum = 0;
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(curSum < 0) {
                curSum = 0;
            }
            curSum += nums[i];
            maxSum = Math.max(curSum, maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubArray(nums);
        System.out.println(result);
    }
}
