class Solution {
    static int minCostClimbingStairs(int[] cost) {
        return Math.min(climb(0,cost),climb(1,cost));
    }
    static int climb(int i, int[] arr){
        if(i >= arr.length) return 0;
        int ans = arr[i] + Math.min(climb(i+1,arr),climb(i+2,arr));
        return ans;
    }
};
