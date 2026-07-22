class Solution {
    static ArrayList<Integer> snakePattern(int arr[][]) {
       ArrayList<Integer> ans = new ArrayList<>();
       for(int i=0; i<arr.length; i++){
            if(i%2 == 0){
                for(int j=0; j<arr[i].length; j++){
                    ans.add(arr[i][j]);
                }
            }
            else{
                for(int j=arr[i].length-1; j>=0; j--){
                    ans.add(arr[i][j]);
                }
            }
       }
       return ans;
        
    }
}
