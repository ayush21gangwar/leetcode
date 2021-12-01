class prblm2006 {
    public int countKDifference(int[] nums, int k) {
        int pairs = 0; 
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < i; j++) {
                if(Math.abs(nums[j] - nums[i]) == k) {
                    pairs++;
                }   
            }
        }
        
        return pairs;
        
    }
}
