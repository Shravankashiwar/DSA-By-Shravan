class Solution {
    public boolean isBST(Node root) {
        Node prev = null;
        Node curr = root;
        while(curr != null){
            if(curr.left != null){
                Node pred = curr.left;
                while(pred.right != null && pred.right != curr){
                    pred = pred.right;
                }
                if(pred.right == null){
                    pred.right = curr;
                    curr = curr.left;
                    
                }
                else{
                    pred.right = null;
                    if(prev != null && curr.data <= prev.data){
                        return false;
                    }
                    prev = curr;
                    curr = curr.right;
                }
            }
            else{
                if(prev != null && curr.data <= prev.data){
                    return false;
                }
                prev = curr;
                curr = curr.right;
            }
            
        }
        return true;
        
    }
}
