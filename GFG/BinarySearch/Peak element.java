class Solution {
    public int peakElement(int[] arr) {
        int n = arr.length;

        if(n < 2) return 0;

        if(arr[0] > arr[1]) return 0;
        if(arr[n - 1] > arr[n - 2]) return n - 1;

        int lo = 1;
        int hi = n - 1;

        while(lo <= hi) {
            int mid = (lo + hi) / 2;

            if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            else if(arr[mid] > arr[mid - 1]) {
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }

        return -1;
    }
}
