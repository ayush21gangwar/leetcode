class prblm_1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String p=""; String o="";
        for (int i = 0; i < word1.length ; i++) {
            p=p+word1[i];
        }
        for (int i = 0; i < word2.length ; i++) {
            o=o+word2[i];
        }
        if(p.equals(o)){
            return true ;
        }
        return false;
        
    }
}