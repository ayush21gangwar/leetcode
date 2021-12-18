class prblm_268 {
    public int missingNumber(int[] nums) {
         int size=nums.length;
        int sum=size*(size+1)/2;
        int actual_sum=0;
        for(int i=0;i<size;i++)
            actual_sum+=nums[i];
         return sum-actual_sum;
    }
}
