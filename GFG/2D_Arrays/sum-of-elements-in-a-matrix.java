class Solution {
    public int sumOfMatrix(int[][] arr) {
        return sum(arr);
    }
    public int sum(int[][] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
