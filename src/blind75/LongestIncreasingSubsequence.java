package blind75;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
     public static int longestConsecutive(int[] nums) {

         if(nums.length == 0) return 0;

         int [] Lis = new int[nums.length];
         Arrays.fill(Lis, 1);
         int max = 1;

         for(int i = 1; i<nums.length; i++){
             for(int j = 0; j<i; j++){
                 if(nums[i]>nums[j]){
                     Lis[i] = Math.max(Lis[i], 1+Lis[j]);
                     max = Math.max(max, Lis[i]);
                 }
             }
         }
     return max;
     }
    public static void main(String[] args) {
         int nums[] ={1,0,11,2,3,4,5,6,7,8,9,10};

         int ans =longestConsecutive(nums);
         System.out.println(ans);

    }
}
