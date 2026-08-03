class pair{
    Node node;
    int dist;
    pair(Node node, int dist){
        this.node = node;
        this.dist = dist;
    }
}
class Solution {
    public ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<pair> q = new LinkedList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int min_dist = Integer.MAX_VALUE;
        int max_dist = Integer.MIN_VALUE;
        q.add(new pair(root,0));
        while(!q.isEmpty()){
            pair front = q.remove();
            Node node = front.node;
            int dist = front.dist;
            min_dist = Math.min(min_dist,dist);
            max_dist = Math.max(max_dist,dist);
            map.put(dist,node.data);
            if(node.left != null) q.add(new pair(node.left,dist-1));
            if(node.right != null) q.add(new pair(node.right,dist+1));
        }
        
        for(int i=min_dist; i<=max_dist; i++){
            ans.add(map.get(i));
        }
        return ans;
    }
}
