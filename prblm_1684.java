class prblm_1684 {
    public int countConsistentStrings(String allowed, String[] words) {
         int count = 0;
        for(String word : words){
            for(int i=0; i<word.length(); i++){
                if(!allowed.contains(word.charAt(i)+"")){
                    count++;
                    break;
                }
            }
        }
        return words.length - count;
        
    }
}
