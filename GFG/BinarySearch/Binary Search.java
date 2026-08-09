class Solution {
    public boolean binarySearch(int[] arr, int tar) {
        int n = arr.length, lo = 0, hi = arr.length-1;
        return search(0, n-1, arr, tar);
        
    }
    public boolean search(int lo, int hi, int[] arr, int tar) {
        
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(arr[mid] == tar) return true;
            else if(arr[mid] > tar) hi = mid-1;
            else{
                lo = mid + 1;
            }
        }
        return false;
    }
}
