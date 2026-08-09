class Solution {
    static int minCostClimbingStairs(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = arr[1];
        return Math.min(cost(0,arr,dp),cost(1,arr,dp));
        
    }
    static int cost(int i, int[] arr, int[] dp){
        int n = arr.length;
        for(i=2; i<n; i++){
            dp[i] = arr[i] + Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[n-1],dp[n-2]);
    }
};
