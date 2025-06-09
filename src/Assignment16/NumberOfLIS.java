package Assignment16;
import java.util.*;
public class NumberOfLIS {

    public static int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        int[] dp = new int[n];        // dp[i] = length of LIS ending at index i
        int[] count = new int[n];     // count[i] = number of LIS ending at index i

        Arrays.fill(dp, 1);
        Arrays.fill(count, 1);

        int maxLen = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        count[i] = count[j]; // new max, copy count
                    } else if (dp[j] + 1 == dp[i]) {
                        count[i] += count[j]; // same max, add ways
                    }
                }
            }
            maxLen = Math.max(maxLen, dp[i]);
        }

        // Count all the ways to form subsequences of length maxLen
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] == maxLen) {
                result += count[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 4, 7};
        System.out.println("Number of LIS: " + findNumberOfLIS(nums));
    }
}
