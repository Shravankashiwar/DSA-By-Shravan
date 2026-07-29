class Solution {
    public boolean isValidBST(TreeNode root) {
        TreeNode prev = null;
        TreeNode curr = root;
        while(curr != null){
            if(curr.left != null){
                TreeNode pred = curr.left;
                while(pred.right != null && pred.right != curr){
                    pred = pred.right;
                }
                if(pred.right == null){
                    pred.right = curr;
                    curr = curr.left;
                    
                }
                else{
                    pred.right = null;
                    if(prev != null && curr.val <= prev.val){
                        return false;
                    }
                    prev = curr;
                    curr = curr.right;
                }
            }
            else{
                if(prev != null && curr.val <= prev.val){
                    return false;
                }
                prev = curr;
                curr = curr.right;
            }
            
        }
        return true;
    }
}
