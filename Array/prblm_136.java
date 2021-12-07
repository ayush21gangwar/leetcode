class prblm_136 {
    public int singleNumber(int[] nums) {
        int result = nums[0];
        if(nums.length==1)
        {
            return result;
        }
        else 
        {
            for(int i =1;i < nums.length;i++)
            {
                result = result^nums[i];
            }
            return result;
        }
    }
}
