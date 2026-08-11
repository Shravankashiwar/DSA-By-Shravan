class Solution {
    static int findFloor(int[] arr, int tar) {
        int n = arr.length, idx = -1, lo = 0, hi = n-1;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(arr[mid] > tar) hi = mid-1;
            else{
                idx = mid;
                lo = mid + 1;
            }
        }
        return idx;
    }
}
