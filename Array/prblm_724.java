class prblm_724 {
    public int pivotIndex(int[] nums) {
      int prefSum[] = new int[nums.length];
        int postfixSum[] = new int[nums.length];
        prefSum[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            prefSum[i] = prefSum[i-1] + nums[i];
        }
        postfixSum[nums.length-1] = nums[nums.length-1];
        for(int i = nums.length-2; i >= 0; i--) {
            postfixSum[i] = postfixSum[i+1] + nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            if(postfixSum[i] == prefSum[i]) {
                return i;
            }
        }
        return -1;
    }
}
