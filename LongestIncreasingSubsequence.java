package longestincreasingsubsequence;
import java.util.*;

public class LongestIncreasingSubsequence {
    public static int findLongestIncreasingSubsequence(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int maxLen = 1;
        
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    maxLen = Math.max(maxLen, dp[i]);
                }
            }
        }
        
        return maxLen;
    }
    
    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        int longestIncreasingSubsequenceLength = findLongestIncreasingSubsequence(nums);
        System.out.println("Longest increasing subsequence length: " + longestIncreasingSubsequenceLength);
    }
}
