class Solution {
    static int[] dp;
    static int nthFibonacci(int n) {
        dp = new int[n+1];
        return fibonacci(n);
    }
    static int fibonacci(int n){
        if(n <= 1) return n;
        if(dp[n] != 0) return dp[n]; 
        int ans = fibonacci(n-1) + fibonacci(n-2);
        dp[n] = ans;
        return ans;
    }
}
