class prblm_58 {
    public int lengthOfLastWord(String s) {
        String []arr=s.split(" ");//spliting strinng using space
    
    int ans=0;
     
    String str=arr[arr.length-1]; //for last word in string

    for(int i=0;i<str.length();i++){ //loop to count the char in  string
      
      ans++;
    }
    return ans;
}
        
    }
