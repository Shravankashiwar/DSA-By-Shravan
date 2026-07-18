class Solution {
    public void rotateArr(int arr[], int k) {
        k = k % arr.length;
        rotate(arr,0,k-1);
        rotate(arr,k,arr.length-1);
        rotate(arr,0,arr.length-1);
        
    }
    public void rotate(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
