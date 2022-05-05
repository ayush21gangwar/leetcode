class prblm_1880 {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        String firstword_sum = "";
            String secondword_sum = "";
        String targetword_sum = "";
        for(int i = 0; i < firstWord.length(); i++){
            int ch = firstWord.charAt(i) - 'a';
            firstword_sum += ch + "";
        }
        for(int i = 0; i < secondWord.length(); i++){
            int ch = secondWord.charAt(i) - 'a';
            secondword_sum += ch + "";
        }
        for(int i = 0; i < targetWord.length(); i++){
            int ch = targetWord.charAt(i) - 'a';
            targetword_sum += ch + "";
        }
        if(((Integer.parseInt(firstword_sum) + Integer.parseInt(secondword_sum)) == Integer.parseInt(targetword_sum))){
            return true;
        }
        return false;
    }
}