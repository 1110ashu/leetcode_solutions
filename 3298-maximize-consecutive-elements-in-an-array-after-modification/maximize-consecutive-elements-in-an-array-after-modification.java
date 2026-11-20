import java.util.Arrays;

class Solution {
    public int maxSelectedElements(int[] nums) {

        Arrays.sort(nums);

        int maxValue = nums[nums.length - 1];

        int[] dp = new int[maxValue + 2];

        int ans = 0;

        for (int x : nums) {

            // Increment x to x + 1
            // Update first to prevent reusing the same element
            dp[x + 1] = Math.max(dp[x + 1], dp[x] + 1);

            // Keep x unchanged
            dp[x] = Math.max(dp[x], dp[x - 1] + 1);

            ans = Math.max(ans, Math.max(dp[x], dp[x + 1]));
        }

        return ans;
    }
}