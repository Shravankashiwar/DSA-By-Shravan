class Solution {
    public TreeNode sortedArrayToBST(int[] arr) {
        int n = arr.length;
        return convert(arr,0,n-1);
        
    }
    public TreeNode convert(int[] arr, int lo, int hi){
        if(lo > hi) return null;
        int mid = (lo+hi)/2;
        
        TreeNode root = new TreeNode(arr[mid]);
        TreeNode a = convert(arr,lo,mid-1);
        TreeNode b = convert(arr,mid+1,hi);
        
        root.left = a;
        root.right = b;
        
        return root;
    }
}
