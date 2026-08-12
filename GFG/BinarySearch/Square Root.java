class Solution {
    int floorSqrt(int num) {
        int lo = 1, hi = num, idx = -1;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(mid * mid > num) hi = mid-1;
            else if(mid * mid <= num){
                idx = mid;
                lo = mid + 1;
            }
        }
        return idx;
        
    }
}
