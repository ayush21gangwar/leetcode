class prblm_345 {
    public String reverseVowels(String str) {
         char[] s = new char[str.length()];
  
        for (int i = 0; i < str.length(); i++) {
            s[i] = str.charAt(i);
        }
        int i=0,j=s.length-1;
        char temp;
        
        while(i<=j){
            if(((s[i]=='a')||(s[i]=='e')||(s[i]=='i')||(s[i]=='o')||(s[i]=='u')||(s[i]=='A')||(s[i]=='E')||(s[i]=='I')||(s[i]=='O')||(s[i]=='U'))){
                if(((s[j]=='a')||(s[j]=='e')||(s[j]=='i')||(s[j]=='o')||(s[j]=='u')||(s[j]=='A')||(s[j]=='E')||(s[j]=='I')||(s[j]=='O')||(s[j]=='U'))){
                    temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                    i++;j--;
                }else{j--;}
            }else{i++;}
        }
        String string = new String(s);
 
        return string;
        
    }
}