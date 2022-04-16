class prblm_2239 {
    public int findClosestNumber(int[] nums) {
           int res = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++)
            if(Math.abs(nums[i]) < Math.abs(res) || nums[i] == Math.abs(res))
                res = nums[i];
        return res;
    }
}