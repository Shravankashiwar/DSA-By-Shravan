class Solution {
    public int[] rearrangeArray(int[] arr) {
        int[] ans = new int[arr.length];
        int pos = 0;
        int neg = 1;
        for(int i = 0; i<ans.length; i++){
            if(arr[i]>0){
                ans[pos] = arr[i];
                pos += 2;
            }
            else{
                ans[neg] = arr[i];
                neg += 2;
            }
        }
        return ans;
    }
}
