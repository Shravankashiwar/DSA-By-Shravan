class Solution {
    void segregate0and1(int[] arr) {
        helper(arr);
        
    }
    void helper(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            if(arr[i]==1 && arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            else if(arr[i] == 0) i++;
            else j--;
        }
    }
}
