class Solution {
    public int minPathSum(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        return path(0,0,m,n,arr);
    }
    public int path(int i, int j, int m, int n, int[][] arr){
        if(i==m-1 && j==n-1) return arr[i][j];
        if(i>=m || j>=n) return Integer.MAX_VALUE;
        return arr[i][j] + Math.min(path(i+1,j,m,n,arr),path(i,j+1,m,n,arr));
    }
}
