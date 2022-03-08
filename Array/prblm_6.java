class prblm_6 {
    public String convert(String s, int numRows) 
    {
         if(numRows == 1){
            return s;
        }
        String result = "";
        int sLen = s.length();
        for(int i = 0; i<numRows; i++){
            int downDiff = (numRows-i-1)*2;
            int upDiff = i*2;
            
            int j = i;
            boolean downDir = i==numRows-1? false: true;
            while(j<sLen){
                result+=s.charAt(j);
                j+= downDir? downDiff: upDiff;
                if(i==0 || i==numRows-1){
                    continue;
                }
                downDir = downDir ^ true;
            }
        }
        return result;
    }
}
