class prblm_540 {
    public int singleNonDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i=i+2)
            if(i==nums.length-1)
                return nums[i];
          else  if(nums[i]!=nums[i+1])
                return nums[i];
        
        return -1;
    }
}








