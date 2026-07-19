class Solution {
    public void sortInWave(int arr[]) {
        wave(arr);   
    }
    public void wave(int[] arr){
        int i = 0;
        int j = i+1;
        while(j < arr.length){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i+=2;
            j+=2;
        }
    }
}
