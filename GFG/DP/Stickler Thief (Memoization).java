class Solution {
    static int[] dp;
    public int findMaxSum(int arr[]) {
        dp = new int[arr.length];
        return loot(0,arr);
    }
    public int loot(int i, int[] arr){
        if(i >= arr.length) return 0;
        if(dp[i] != 0) return dp[i];
        int pick = arr[i] + loot(i+2,arr);
        int skip = loot(i+1,arr);
        int ans = Math.max(pick,skip);
        dp[i] = ans;
        return ans;
    }
}
