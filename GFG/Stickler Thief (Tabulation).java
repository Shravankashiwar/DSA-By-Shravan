class Solution {
    public int findMaxSum(int arr[]) {
        int n = arr.length;
        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0],arr[1]);
        return loot(arr,dp);
        
    }
    public int loot(int[] arr, int[] dp){
        int n = arr.length;
        for(int i=2; i<n; i++){
            dp[i] = Math.max(arr[i] + dp[i-2],dp[i-1]);
        }
        return dp[n-1];
    }
}
