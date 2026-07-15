class Solution {
    public int search(int arr[], int target) {
        return find(arr,target);
        
    }
    public int find(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target) return i;
        }
        return -1;
    }
}
