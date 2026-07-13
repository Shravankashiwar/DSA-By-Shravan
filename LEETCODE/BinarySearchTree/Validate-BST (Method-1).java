class Solution {
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        LevelOrder(root,arr);
        return check(arr);
    }
    
    public void LevelOrder(TreeNode root, ArrayList<Integer> arr){
        if(root == null) return;
        LevelOrder(root.left,arr);
        arr.add(root.val);
        LevelOrder(root.right,arr);  
    }

    public boolean check(ArrayList<Integer> arr){
        for(int i=0; i<arr.size()-1; i++){
            if(arr.get(i) >= arr.get(i+1)){
                return false;
            }
        }
        return true;
    }
}
