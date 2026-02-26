package blind75;

public class FindMin {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int ans = nums[0];

        if (nums.length == 1) {
            return nums[0];
        }

        while (left <= right) {
            if (nums[left] < nums[right]) {
                ans = Math.min(ans, nums[left]);
            }

            int mid = (left + right) / 2;

            ans = Math.min(ans, nums[mid]);

            if (nums[left] <= nums[mid]) {
                left = mid + 1;
            } else {
                right = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        FindMin fm = new FindMin();
        int[] arr = {6,7, 2, 3, 4, 5};
        System.out.println(fm.findMin(arr));
    }
}
