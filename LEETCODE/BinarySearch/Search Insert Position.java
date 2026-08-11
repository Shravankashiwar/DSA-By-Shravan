class Solution {
    public int searchInsert(int[] arr, int tar) {
        int n = arr.length, idx = -1, lo = 0, hi = n-1;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(arr[mid] >= tar){
                idx = mid;
                hi = mid-1;
            } 
            else{
                idx = mid+1;
                lo = mid + 1;
            }
        }
        return idx;
    }
}
