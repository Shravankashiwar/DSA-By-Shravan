class Solution {
    public int[] searchRange(int[] arr, int target) {
        int n = arr.length;
        
        int[] ans = new int[2];
        
        int first_occur = first(0, n-1, arr, target);
        int last_occur = last(0, n-1, arr, target);
        
        ans[0] = first_occur;
        ans[1] = last_occur;
        
        return ans;
        
    }
    static int first(int lo, int hi, int[] arr, int target){
        int idx = -1;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(arr[mid] == target){
                hi = mid - 1;
                idx = mid;
            }
            else if(arr[mid] > target) hi = mid - 1;
            else lo = mid + 1;
        }
        return idx;
    }
    static int last(int lo, int hi, int[] arr, int target){
        int idx = -1;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(arr[mid] == target){
                lo = mid + 1;
                idx = mid;
            }
            else if(arr[mid] > target) hi = mid - 1;
            else lo = mid + 1;
        }
        return idx;
    }
}
