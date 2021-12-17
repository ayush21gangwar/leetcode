class prblm_125 {
    public boolean isPalindrome(String s) {
        String str = "";
        for(int i=0;i<s.length();i++){
           int asc = s.charAt(i);
            
            //to convert capital letters to small ones
            if(asc>=65 && asc<=90){
                str+=(char)(s.charAt(i)+32);
            }
            //directly adding small letters to my string
            else if(asc>=97 && asc<=122){
                str+=s.charAt(i);
            }
            //to add numbers in my string
            else if(asc>=48 && asc<=57){
                str+=s.charAt(i);
            }
        }
        int i = 0;
        int j = str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
         
