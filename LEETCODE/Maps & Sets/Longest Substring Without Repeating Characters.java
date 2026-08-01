class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int i = 0;
        int j = 0;
        HashSet<Character> set = new HashSet<>();
        while(j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
            }
            else{
                int len = j-i;
                maxLen = Math.max(len,maxLen);
                while(s.charAt(i) != s.charAt(j)){
                    set.remove(s.charAt(i));
                    i++;
                }
                i++;
                j++;
            }
        }
        int len = j-i;
        maxLen = Math.max(len,maxLen);
        return maxLen;
    }
}
