class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(climb(0,cost,dp),climb(1,cost,dp));
    }
    public int climb(int i, int[] arr, int[] dp){
        if(i >= arr.length) return 0;
        if(dp[i] != -1) return dp[i];
        int ans = arr[i] + Math.min(climb(i+1,arr,dp),climb(i+2,arr,dp));
        dp[i] = ans;
        return ans;
    }
}
