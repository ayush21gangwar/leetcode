class prblm_1832 {
    public boolean checkIfPangram(String sentence) {
        int Number_of_char=26;
        int count=0;
        String chars="abcdefghijklmnopqrstuvwxyz";
            for(int i=0;i<=chars.length()-1;i++){
                if(sentence.contains(String.valueOf(chars.charAt(i)))){
                    
                
                count++;
                }
                if(count==Number_of_char){
                    return true;
                }
                
                 
                
                
            }
         return false;
        
    }
}