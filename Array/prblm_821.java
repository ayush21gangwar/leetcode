class prblm_821 {
    public int[] shortestToChar(String s, char c) {
         int[] res = new int[s.length()];
        int charIdx = -s.length();
          for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                charIdx = i;
            }
            res[i] = Math.abs(charIdx - i);
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                charIdx = i;
            }
            res[i] = Math.min(res[i], Math.abs(charIdx - i));
        }
        return res;
    }
}