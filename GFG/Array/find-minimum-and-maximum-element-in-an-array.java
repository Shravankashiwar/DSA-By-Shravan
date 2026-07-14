class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        int max = maxVal(arr,Integer.MIN_VALUE);
        int min = minVal(arr,Integer.MAX_VALUE);
        
        ans.add(min);
        ans.add(max);
        
        return ans;
        
    }
    public int maxVal(int[] arr, int max){
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }
    public int minVal(int[] arr, int min){
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min) min = arr[i];
        }
        return min;
    }
}
