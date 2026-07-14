class Solution {
    public static int largest(int[] arr) {
        int max = Integer.MIN_VALUE;
        return maximum(arr,max);
        
    }
    public static int maximum(int[] arr, int max){
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }
}
