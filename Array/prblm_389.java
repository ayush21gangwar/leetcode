class prblm_389 {
    public char findTheDifference(String s, String t) {
       int count=0;
        for (int i = 'a'; i <='z' ; i++) {
            for (int j = 0; j < s.length(); j++)
                if(s.charAt(j)==i)
                    count++;

            for (int j = 0; j < t.length(); j++)
                if(t.charAt(j)==i)
                    count--;
           
            if(count!=0)
                return (char)i;
        }
         return 0;
    }
}
