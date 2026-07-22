class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        helper(mat);
        addInList(ans,mat);
        return ans;
    }
    public void helper(int[][] mat){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<i; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
    public void addInList(ArrayList<ArrayList<Integer>> ans, int[][] mat){
        for(int i=0; i<mat.length; i++){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j=0; j<mat[i].length; j++){
                arr.add(mat[i][j]);
            }
            ans.add(arr);
        }
    }
}
