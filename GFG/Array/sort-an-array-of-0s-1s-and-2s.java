class Solution {
    public void sort012(int[] arr) {
        
        int zero_count = 0, one_count = 0, two_count = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0) zero_count++;
            else if(arr[i] == 1) one_count++;
            else two_count++;
        }
        
        int sum = zero_count + one_count;
        int sum1 = zero_count + one_count + two_count;
        
        helper(arr,0,zero_count,0);
        helper(arr,zero_count,sum,1);
        helper(arr,sum,sum1,2);
    }
    
    public void helper(int[] arr, int start, int end, int val){
        
        for(int i=start; i<end; i++) arr[i] = val;
    }
}
