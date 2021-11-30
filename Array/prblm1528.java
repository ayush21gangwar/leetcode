class prblm1528 {
    public String restoreString(String s, int[] indices) {
        char cs[] = new char[indices.length];
         for(int i=0;i<indices.length;i++){
        cs[indices[i]]=s.charAt(i);
    }
    String ans = new String(cs);
    
    
    return ans;
}
}

