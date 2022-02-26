class prblm_14 {
    public String longestCommonPrefix(String[] strs) {
         String ans = "";
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int c = 0;
        while(c < first.length()) {
            if(first.charAt(c)==last.charAt(c)) c++;
            else break;
        }
        if( c == 0) return ans;
        return first.substring(0, c);
        
    }
}
