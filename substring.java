class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int i=0;
        int j=0;
        Set<Character> set=new HashSet<>();
        while(i<s.length()&&j<s.length()){
        if(!set.contains(s.charAt(j)))
        {
            set.add(s.charAt(j));
            j++;
            max=Math.max(max,j-i);
        }
        else
        {
            set.remove(s.charAt(i));
            i++;
        }
        }
        return max;
    }
}