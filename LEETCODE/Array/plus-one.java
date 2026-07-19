class Solution {
    public int[] plusOne(int[] arr) {
        int[] ans = new int[arr.length];
        int carry = 1;
        for(int i=ans.length-1; i>=0; i--){
            if(carry + arr[i] <= 9){
                ans[i] = arr[i] + carry;
                carry = 0;
            }
            else{
                ans[i] = 0;
                carry = 1;
            }
        }
        if(carry == 0) return ans;

        int[] result = new int[ans.length+1];
        result[0] = 1;
        return result;
    }
}
