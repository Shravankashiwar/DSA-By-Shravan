class Solution {
    public int search(int[] arr, int target) {
        int n = arr.length, lo = 0, hi = n-1, idx = -1;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(arr[mid] == target){
                idx = mid;
                return idx;
            }
            else if(arr[mid] > target) hi = mid-1;
            else lo = mid+1;
        }
        return idx;
    }
}
