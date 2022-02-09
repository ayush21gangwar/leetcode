class prblm_3 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>set= new HashSet();
        int longest=0,i=0,j=0,n=s.length();
        while(i<n&&j<n){
            if(set.contains(s.charAt(j))){
                set.remove(s.charAt(i++));
                
            }else{
                set.add(s.charAt(j++));
                longest=Math.max(longest,j-i);
            }
        }
        
        return longest;
    }
}
