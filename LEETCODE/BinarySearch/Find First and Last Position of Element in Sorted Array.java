class Solution {
    public int[] searchRange(int[] arr, int tar) {
        int[] ans = new int[2];
        int n = arr.length;
        int first_occur = first(0, n-1, arr, tar);
        int last_occur = last(0, n-1, arr, tar);
        ans[0] = first_occur;
        ans[1] = last_occur;
        return ans;
        
    }
    int first(int lo, int hi, int[] arr, int tar){
        
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(arr[mid] > tar) hi = mid - 1;
            else if(arr[mid] < tar) lo = mid + 1;
            else{
                if(mid == 0 || arr[mid-1] != tar) return mid;
                else hi = mid - 1;
            }
        }
        return -1;
        
    }
    int last(int lo, int hi, int[] arr, int tar){
        
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(arr[mid] > tar) hi = mid - 1;
            else if(arr[mid] < tar) lo = mid + 1;
            else{
                if(mid == arr.length-1 || arr[mid+1] != tar) return mid;
                else lo = mid +1;
            }
        }
        return -1;
    }
}
