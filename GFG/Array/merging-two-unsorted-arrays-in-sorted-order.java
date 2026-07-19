class Solution {
    public int[] sortedMerge(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int[] arr = new int[a.length + b.length];
        merge(arr,a,b);
        return arr;
    }
    public void merge(int[] arr, int[] a, int[] b){
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i<a.length && j<b.length){
            if(a[i] < b[j]){
                arr[k++] = a[i++];
            }
            else{
                arr[k++] = b[j++];
            }
        }
        
        while(i < a.length){
            arr[k++] = a[i++];
        }
        
        while(j < b.length){
            arr[k++] = b[j++];
        }
    }
}
