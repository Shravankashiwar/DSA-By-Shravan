class Solution {
    public boolean isSubset(int a[], int b[]) {
        HashMap<Integer,Integer> aMap = new HashMap<>();
        HashMap<Integer,Integer> bMap = new HashMap<>();
        
        for(int i=0; i<a.length; i++){
            if(aMap.containsKey(a[i])){
                int freq = aMap.get(a[i]);
                aMap.put(a[i],freq+1);
            }
            else aMap.put(a[i],1);
        }
        
        for(int i=0; i<b.length; i++){
            if(bMap.containsKey(b[i])){
                int freq = bMap.get(b[i]);
                bMap.put(b[i],freq+1);
            }
            else bMap.put(b[i],1);
        }
        
        for(int ele : bMap.keySet()){
            if(!aMap.containsKey(ele)) return false;
            int freq = aMap.get(ele);
            int freq2 = bMap.get(ele);
            if(freq < freq2) return false;
        }
        
        return true;
    }
}
