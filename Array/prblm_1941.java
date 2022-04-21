class prblm_1941 {
    public boolean areOccurrencesEqual(String s) {
        boolean output = true;
	int[] alphabets = new int[26];
	for(int i = 0;i<s.length();i++)
		alphabets[s.charAt(i)-'a']++;

	int firstOcc = 0;
	for(int j = 0;j<alphabets.length;j++) {
		if(firstOcc==0 && alphabets[j]>0)
		firstOcc = alphabets[j];
		
		if(alphabets[j]>0 && alphabets[j]!=firstOcc) {
			output = false;
			break;
		}
	}
	return output;
        
    }
}