class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i] > max) max = arr[i];
        }
        
        int max2 = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i] > max2 && arr[i] != max) max2 = arr[i];
        }
        
        if(max2 == Integer.MIN_VALUE) return -1;
        
        return max2;
    }
}
