
class prblm_771 {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (char c : stones.toCharArray()) 
        {
            if (jewels.contains(c + ""))
            {
                count++;
            }
        }
        return count;
    }
} 