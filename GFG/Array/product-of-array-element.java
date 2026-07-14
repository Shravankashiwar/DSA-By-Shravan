class Solution {
    public long product(long arr[]) {
        long product = 1;
        return helper(arr,product);
        
    }
    public long helper(long[] arr, long product){
        long mod = 1000000007;
        int n = arr.length;
        for(int i=0; i<n; i++){
            product = (product * arr[i]) % mod;
        }
        return product;
    }
}
