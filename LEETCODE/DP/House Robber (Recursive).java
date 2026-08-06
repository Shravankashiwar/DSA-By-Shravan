class Solution {
    public int rob(int[] arr) {
        return loot(0,arr);
    }
    public int loot(int i, int[] arr){
        if(i >= arr.length) return 0;
        int pick = arr[i] + loot(i+2,arr);
        int skip = loot(i+1,arr);
        return Math.max(pick,skip);
    }
}
