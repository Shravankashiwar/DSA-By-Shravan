class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node top = st.pop();
            ans.add(top.data);
            if(top.left != null) st.push(top.left);
            if(top.right != null) st.push(top.right);
        }
        Collections.reverse(ans);
        return ans;
    }
}
