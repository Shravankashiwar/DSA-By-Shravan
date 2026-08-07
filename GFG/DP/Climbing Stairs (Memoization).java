class Solution {
    public int countWays(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return count(n,dp);
    }
    public int count(int n, int[] dp) {
        if(n <= 1) return 1;
        if(dp[n] != -1) return dp[n];
        int ans = count(n-1,dp) + count(n-2,dp);
        dp[n] = ans;
        return ans;
    }
}
