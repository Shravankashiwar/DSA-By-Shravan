class Solution {
    public int mySqrt(int num) {
        if(num < 2) return num;
        long lo = 1, hi = num, idx = -1;
        while(lo <= hi){
            long mid = (lo+hi)/2;
            if(mid * mid > num) hi = mid-1;
            else if(mid * mid <= num){
                idx = mid;
                lo = mid + 1;

            }
        }
        return (int) idx;
    }
}
