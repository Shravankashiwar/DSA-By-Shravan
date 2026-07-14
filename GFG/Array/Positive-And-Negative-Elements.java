class Solution {
    ArrayList<Integer> arranged(ArrayList<Integer> arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<arr.size(); i++){
            ans.add(0);
            
        }        
        int pos = 0;
        int neg = 1;
        
        for(int i=0; i<ans.size(); i++){
            if(arr.get(i)>0 ){
                ans.set(pos,arr.get(i));
                pos+=2;
            }
            else{
                ans.set(neg,arr.get(i));
                neg+=2;
            }
        }
        return ans; 
    }  
}
