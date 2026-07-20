class Solution {
    public int[] sortedMerge(int[] a, int[] b) {
        int[] ans = new int[a.length + b.length];
        Arrays.sort(a);
        Arrays.sort(b);
        helper(ans,a,b);
        return ans;
    }
    public void helper(int[] ans, int[] a, int[] b){
        int i=a.length-1, j=b.length-1, k=ans.length-1;
        
        while(i>=0 && j>=0){
            if(a[i] <= b[j]) ans[k--] = b[j--];
            else ans[k--] = a[i--];
        }
        
        while(j >= 0) ans[k--] = b[j--];
        
        while(i >= 0) ans[k--] = a[i--];
    }
}
