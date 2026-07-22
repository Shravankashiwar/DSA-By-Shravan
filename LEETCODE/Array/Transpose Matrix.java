class Solution {
    public int[][] transpose(int[][] arr) {
        int[][] ans = new int[arr[0].length][arr.length];
        setInAns(ans,arr);
        return ans;
    }
    
    public void setInAns(int[][] ans, int[][] arr){
        for(int j=0; j<arr[0].length; j++){
            for(int i=0; i<arr.length; i++){
                ans[j][i] = arr[i][j];
            }
        }
    }
}
