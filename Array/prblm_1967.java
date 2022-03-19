class prblm_1967 {
    public int numOfStrings(String[] patterns, String word) {
       //  public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String s : patterns)
        {
            if(word.contains(s))
                count++;
        }
        return count;
    }
}